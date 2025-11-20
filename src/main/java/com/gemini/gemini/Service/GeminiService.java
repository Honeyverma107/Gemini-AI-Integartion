package com.gemini.gemini.Service; 
import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import org.springframework.stereotype.Service;

@Service
public class GeminiService {

    private final Client client;

    public GeminiService() {
        // No argument needed — client uses service account JSON from env variable
        this.client = new Client();
    }

    public String askGemini(String query) {
        try {
            GenerateContentResponse response =
                client.models.generateContent("gemini-2.5-flash", query, null);
            return response.text();
        } catch (Exception e) {
            e.printStackTrace();
            return "Error: " + e.getMessage();
        }
    }
}
