package com.techelevator.dao;

import com.techelevator.model.Dictionary;

import java.util.List;

public interface DictionaryDao {
    List<Dictionary> getAllDictionaries();
    Dictionary getDictionaryById(long id);
    List<Dictionary> getAllDictionariesForCollection(long collectionId);
    Dictionary updateDictionary(long id, Dictionary dictionary);
    Dictionary createDictionary(Dictionary dictionary);
    void deleteDictionary(long id);
}
