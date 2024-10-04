package com.techelevator.model;

public class Collection {
    private final long id;
    private final String name;

    public Collection(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
