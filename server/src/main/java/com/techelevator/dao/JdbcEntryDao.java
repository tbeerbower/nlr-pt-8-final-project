package com.techelevator.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import com.techelevator.model.Entry;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class JdbcEntryDao implements EntryDao {
    private final JdbcTemplate template;

    private final RowMapper<Entry> mapper = new RowMapper<Entry>() {
        @Override
        public Entry mapRow(ResultSet rs, int rowNum) throws SQLException {
            long id = rs.getLong("id");
            long dictionaryId = rs.getLong("dictionary_id");
            String word = rs.getString("word");
            String pos = rs.getString("pos");
            String definition = rs.getString("definition");
            return new Entry(id, dictionaryId, word, pos, definition);
        }
    };

    public JdbcEntryDao(DataSource dataSource) {
        template = new JdbcTemplate(dataSource);
    }

    @Override
    public Entry getEntryById(long id) {
        List<Entry> entries = template.query("SELECT * FROM entry WHERE id = ?", mapper, id);
        return entries.isEmpty() ? null : entries.get(0);
    }

    @Override
    public List<Entry> getAllEntries() {
        return template.query("SELECT * FROM entry ORDER BY word", mapper);
    }

    @Override
    public List<Entry> getAllEntriesForDictionary(long dictionaryId) {
        return template.query("SELECT * FROM entry WHERE dictionary_id = ? ORDER BY word", mapper, dictionaryId);
    }
    @Override
    public List<Entry> getAllEntriesForWord(String word) {
        return template.query("SELECT * FROM entry WHERE word = ?", mapper, word);
    }

    public Entry createEntry(long dictionaryId, Entry entry) {
        Long id = template.queryForObject("INSERT INTO entry (word, pos, definition, dictionary_id) " +
                        "VALUES(?,?,?,?) RETURNING id",
                long.class, entry.getWord(), entry.getPos(), entry.getDefinition(), dictionaryId);

        return id == null ? null : getEntryById(id);
    }

    @Override
    public Entry updateEntry(long id, Entry entry) {
        int count = template.update("UPDATE entry SET word = ?, pos = ?, definition = ?, dictionary_id = ? WHERE id = ?",
                entry.getWord(), entry.getPos(), entry.getDefinition(), entry.getDictionaryId(), id);

        return count == 0 ? null : getEntryById(id);
    }

    @Override
    public void deleteEntry(long id) {
        template.update("DELETE FROM entry WHERE id = ?", id);
    }
}
