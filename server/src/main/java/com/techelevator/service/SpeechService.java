package com.techelevator.service;

import com.techelevator.model.Entry;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SpeechService {

    private static final String TTS_API_URL = "https://api.voicerss.org";
    private static final String TTS_TOKEN = "1db885d5d5514372867c16e187528708";
    private static final String TTS_MALE_VOICE = "John";
    private static final String TTS_FEMALE_VOICE = "Linda";

    private final RestTemplate template = new RestTemplate();

    public ResponseEntity<byte[]> getSpeechFromEntry(Entry entry, boolean femaleVoice) {

        String text = String.format("%s!,%s", entry.getWord(), entry.getDefinition());

        String apiUrl = String.format("%s?key=%s&hl=en-us&v=%s&src=%s",
                TTS_API_URL, TTS_TOKEN,
                femaleVoice ? TTS_FEMALE_VOICE : TTS_MALE_VOICE,
                text);

        byte[] audioContent = template.getForObject(apiUrl, byte[].class);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.parseMediaType("audio/wav"));
        headers.setContentLength(audioContent.length);

        return new ResponseEntity<>(audioContent, headers, HttpStatus.OK);
    }
}
