package com.techelevator.model;

public class Dictionary {
    private final long id;
    private final long collectionId;
    private final String name;

    public Dictionary(long id, long collectionId, String name) {
        this.id = id;
        this.collectionId = collectionId;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getCollectionId() {
        return collectionId;
    }

    @Override
    public String toString() {
        return name;
    }
}
