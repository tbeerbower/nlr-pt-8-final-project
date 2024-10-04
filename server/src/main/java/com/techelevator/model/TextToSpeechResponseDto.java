package com.techelevator.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TextToSpeechResponseDto {

    @JsonProperty("audio_file_url")
    private final String audioFileUrl;
    @JsonProperty("audio_file_type")
    private final String audioFileType;

    public TextToSpeechResponseDto(String audioFileUrl, String audioFileType) {
        this.audioFileUrl = audioFileUrl;
        this.audioFileType = audioFileType;
    }

    public String getAudioFileUrl() {
        return audioFileUrl;
    }

    public String getAudioFileType() {
        return audioFileType;
    }
}
