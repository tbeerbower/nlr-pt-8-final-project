package com.techelevator.dao;

import com.techelevator.model.Dictionary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import com.techelevator.model.Collection;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class JdbcCollectionDao implements CollectionDao {
    private final JdbcTemplate template;

    private final RowMapper<Collection> mapper = new RowMapper<Collection>() {
        @Override
        public Collection mapRow(ResultSet rs, int rowNum) throws SQLException {
            long id = rs.getLong("id");
            String name = rs.getString("name");
            return new Collection(id, name);
        }
    };

    public JdbcCollectionDao(DataSource dataSource) {
        template = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Collection> getAllCollections() {
        return template.query("SELECT * FROM collection", mapper);
    }

    @Override
    public Collection getCollectionById(long id) {
        List<Collection> collections =
                template.query("SELECT * FROM collection WHERE id = ?", mapper, id);
        return collections.isEmpty() ? null : collections.get(0);
    }

    @Override
    public Collection updateCollection(long id, Collection collection) {
        int count = template.update("UPDATE collection SET name = ? WHERE id = ?",
                collection.getName(), id);

        return count == 0 ? null : getCollectionById(id);
    }

    @Override
    public Collection createCollection(Collection collection) {
        Long id = template.queryForObject("INSERT INTO collection (name) " +
                        "VALUES(?) RETURNING id",
                long.class, collection.getName());

        return id == null ? null : getCollectionById(id);
    }

    @Override
    public void deleteCollection(long id) {
        template.update("DELETE FROM collection WHERE id = ?", id);
    }
}
