package com.techelevator.model;

public class EntrySpeechDto {
    private final Entry entry;
    private final String audioFileUrl;


    public EntrySpeechDto(Entry entry, String audioFileUrl) {
        this.entry = entry;
        this.audioFileUrl = audioFileUrl;
    }

    public Entry getEntry() {
        return entry;
    }

    public String getAudioFileUrl() {
        return audioFileUrl;
    }
}
