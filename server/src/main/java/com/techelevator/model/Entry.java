package com.techelevator.model;

public class Entry {

    private final long id;
    private final long dictionaryId;
    private final String word;

    private final String pos;
    private final String definition;


    public Entry(long id, long dictionaryId, String word, String pos, String definition) {
        this.id = id;
        this.dictionaryId = dictionaryId;
        this.word = word;
        this.pos = pos;
        this.definition = definition;
    }

    public long getId() {
        return id;
    }

    public long getDictionaryId() {
        return dictionaryId;
    }

    public String getWord() {
        return word;
    }

    public String getPos() {
        return pos;
    }

    public String getDefinition() {
        return definition;
    }

    @Override
    public String toString() {
        return word + " (" + pos + "): " + definition;
    }
}
