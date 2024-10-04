package com.techelevator.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import com.techelevator.model.Dictionary;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class JdbcDictionaryDao implements DictionaryDao {
    private final JdbcTemplate template;

    private final RowMapper<Dictionary> mapper = new RowMapper<Dictionary>() {
        @Override
        public Dictionary mapRow(ResultSet rs, int rowNum) throws SQLException {
            long id = rs.getLong("id");
            long collectionId = rs.getLong("collection_id");
            String name = rs.getString("name");
            return new Dictionary(id, collectionId, name);
        }
    };

    public JdbcDictionaryDao(DataSource dataSource) {
        template = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Dictionary> getAllDictionaries() {
        return template.query("SELECT * FROM dictionary", mapper);
    }

    @Override
    public Dictionary getDictionaryById(long id) {
        List<Dictionary> dictionaries =
                template.query("SELECT * FROM dictionary WHERE id = ?", mapper, id);
        return dictionaries.isEmpty() ? null : dictionaries.get(0);
    }

    @Override
    public List<Dictionary> getAllDictionariesForCollection(long collectionId) {
        return template.query("SELECT * FROM dictionary WHERE collection_id = ?", mapper, collectionId);
    }

    @Override
    public Dictionary updateDictionary(long id, Dictionary dictionary) {
        int count = template.update("UPDATE dictionary SET name = ?, collection_id = ? WHERE id = ?",
                dictionary.getName(), dictionary.getCollectionId(), id);

        return count == 0 ? null : getDictionaryById(id);
    }

    @Override
    public Dictionary createDictionary(Dictionary dictionary) {
        Long id = template.queryForObject("INSERT INTO dictionary (name, collection_id) " +
                        "VALUES(?,?) RETURNING id",
                long.class, dictionary.getName(), dictionary.getCollectionId());

        return id == null ? null : getDictionaryById(id);
    }

    @Override
    public void deleteDictionary(long id) {
        template.update("DELETE FROM dictionary WHERE id = ?", id);
    }
}
