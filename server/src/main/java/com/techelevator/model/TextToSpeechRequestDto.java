package com.techelevator.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TextToSpeechRequestDto {
    private final String token;
    private final String text;
    @JsonProperty("voice_id")
    private final int voiceId;
    @JsonProperty("audio_format")
    private final String audioFormat;

    public TextToSpeechRequestDto(String token, String text, int voiceId, String audioFormat) {
        this.token = token;
        this.text = text;
        this.voiceId = voiceId;
        this.audioFormat = audioFormat;
    }

    public String getToken() {
        return token;
    }

    public String getText() {
        return text;
    }

    public int getVoiceId() {
        return voiceId;
    }

    public String getAudioFormat() {
        return audioFormat;
    }
}
