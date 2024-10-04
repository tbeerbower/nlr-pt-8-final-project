package com.techelevator.dao;

import com.techelevator.model.Entry;

import java.util.List;

public interface EntryDao {

    Entry getEntryById(long id);
    List<Entry> getAllEntries();
    List<Entry> getAllEntriesForDictionary(long dictionaryId);
    List<Entry> getAllEntriesForWord(String word);
    Entry createEntry(long dictionaryId, Entry entry);

    Entry updateEntry(long id, Entry entry);
    void deleteEntry(long id);
}
