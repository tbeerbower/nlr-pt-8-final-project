package com.techelevator.controller;

import com.techelevator.dao.EntryDao;
import com.techelevator.model.Entry;
import com.techelevator.model.EntrySpeechDto;
import com.techelevator.service.SpeechService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/entries")
public class EntryController {

    private final EntryDao entryDao;
    private final SpeechService speechService;

    public EntryController(EntryDao entryDao, SpeechService speechService) {
        this.entryDao = entryDao;
        this.speechService = speechService;
    }

    @GetMapping
    public List<Entry> getEntries() {
        return entryDao.getAllEntries();
    }

    @GetMapping(path = "/{id}")
    public Entry getEntry(@PathVariable long id) {
        return entryDao.getEntryById(id);
    }

    @GetMapping(path = "/{id}/speech")
    public ResponseEntity<byte[]> getEntrySpeech(@PathVariable long id, @RequestParam(defaultValue = "female") String voice) throws UnsupportedEncodingException {
        Entry entry = entryDao.getEntryById(id);
        return speechService.getSpeechFromEntry(entry, !voice.equalsIgnoreCase("male"));
    }

    @PreAuthorize("hasRole('ADMIN')")
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Entry createEntry(@RequestBody Entry entry) {
        return entryDao.createEntry(entry.getDictionaryId(), entry);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping(path = "/{id}")
    public Entry updateEntry(@PathVariable long id, @RequestBody Entry entry) {
        return entryDao.updateEntry(id, entry);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "/{id}")
    public void deleteEntry(@PathVariable long id) {
        entryDao.deleteEntry(id);
    }
}
