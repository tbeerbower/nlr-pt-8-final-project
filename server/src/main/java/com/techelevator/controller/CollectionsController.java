package com.techelevator.controller;

import com.techelevator.dao.CollectionDao;
import com.techelevator.dao.DictionaryDao;
import com.techelevator.model.Collection;
import com.techelevator.model.Dictionary;
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
@RequestMapping("/collections")
public class CollectionsController {

    private final CollectionDao collectionDao;
    private final DictionaryDao dictionaryDao;

    public CollectionsController(CollectionDao collectionDao, DictionaryDao dictionaryDao) {
        this.collectionDao = collectionDao;
        this.dictionaryDao = dictionaryDao;
    }


    //    @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public List<Collection> getAllCollections() {
        return collectionDao.getAllCollections();
    }

    @GetMapping(path = "/{collectionId}/dictionaries")
    public List<Dictionary> getAllDictionariesForCollection(@PathVariable long collectionId) {
        return dictionaryDao.getAllDictionariesForCollection(collectionId);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Collection createCollection(@RequestBody Collection collection) {
        return collectionDao.createCollection(collection);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping(path = "/{id}")
    public Collection updateCollection(@PathVariable long id, @RequestBody Collection collection) {
        return collectionDao.updateCollection(id, collection);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "/{id}")
    public void deleteCollection(@PathVariable long id) {
        collectionDao.deleteCollection(id);
    }
}
