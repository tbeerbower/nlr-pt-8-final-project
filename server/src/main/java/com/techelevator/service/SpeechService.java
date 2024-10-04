package com.techelevator.service;

import com.techelevator.model.TextToSpeechResponseDto;
import com.techelevator.model.Entry;
import com.techelevator.model.TextToSpeechRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SpeechService {

    private static final String TTS_MAKER_API_URL = "https://api.ttsmaker.com/v1/create-tts-order";
    private static final String TTS_MAKER_TOKEN = "ttsmaker_demo_token";
    private static final String TTS_AUDIO_FORMAT = "mp3";
    private static final int TTS_MAKER_MALE_VOICE_ID = 777;
    private static final int TTS_MAKER_FEMALE_VOICE_ID = 778;

    private final RestTemplate template = new RestTemplate();

    public String getSpeechFromEntry(Entry entry, boolean femaleVoice) {

        String text = String.format("%s, %s", entry.getWord(), entry.getDefinition());
        TextToSpeechRequestDto textToSpeechRequest = new TextToSpeechRequestDto(
                TTS_MAKER_TOKEN,
                text,
                femaleVoice ? TTS_MAKER_FEMALE_VOICE_ID : TTS_MAKER_MALE_VOICE_ID,
                TTS_AUDIO_FORMAT);

        ResponseEntity<TextToSpeechResponseDto> responseEntity = template.postForEntity(
                TTS_MAKER_API_URL, textToSpeechRequest, TextToSpeechResponseDto.class);

        TextToSpeechResponseDto textToSpeechResponse = responseEntity.getBody();
        return textToSpeechResponse == null ? "" : textToSpeechResponse.getAudioFileUrl();
    }
}
