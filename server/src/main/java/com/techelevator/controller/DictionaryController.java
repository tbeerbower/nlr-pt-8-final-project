package com.techelevator.controller;

import com.techelevator.dao.DictionaryDao;
import com.techelevator.dao.EntryDao;
import com.techelevator.model.Dictionary;
import com.techelevator.model.Entry;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/dictionaries")
public class DictionaryController {

    private final DictionaryDao dictionaryDao;
    private final EntryDao entryDao;

    public DictionaryController(DictionaryDao dictionaryDao, EntryDao entryDao) {
        this.dictionaryDao = dictionaryDao;
        this.entryDao = entryDao;
    }

    @GetMapping
    public List<Dictionary> getAllDictionaries() {
        return dictionaryDao.getAllDictionaries();
    }

    @GetMapping(path = "/{dictionaryId}/entries")
    public List<Entry> getAllEntriesForDictionary(@PathVariable long dictionaryId) {
        return entryDao.getAllEntriesForDictionary(dictionaryId);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Dictionary createDictionary(@RequestBody Dictionary dictionary) {
        return dictionaryDao.createDictionary(dictionary);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping(path = "/{id}")
    public Dictionary updateDictionary(@PathVariable long id, @RequestBody Dictionary dictionary) {
        return dictionaryDao.updateDictionary(id, dictionary);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "/{id}")
    public void deleteDictionary(@PathVariable long id) {
        dictionaryDao.deleteDictionary(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(path = "/{dictionaryId}/entries")
    public Entry createEntryForDictionary(@PathVariable long dictionaryId, @RequestBody Entry entry) {
        return entryDao.createEntry(dictionaryId, entry);
    }
}
