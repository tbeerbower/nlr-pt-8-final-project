package com.techelevator.dao;

import com.techelevator.model.Collection;
import com.techelevator.model.Dictionary;

import java.util.List;

public interface CollectionDao {
    List<Collection> getAllCollections();
    Collection getCollectionById(long id);
    Collection updateCollection(long id, Collection collection);
    Collection createCollection(Collection collection);
    void deleteCollection(long id);
}
