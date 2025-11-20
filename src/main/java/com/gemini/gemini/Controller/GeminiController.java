
package com.gemini.gemini.Controller;

import com.gemini.gemini.Service.GeminiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gemini")
public class GeminiController {

    @Autowired
    private GeminiService geminiService;

    @PostMapping("/ask")
    public String askGeminiApi(@RequestParam String query) {
        return geminiService.askGemini(query);
    }
}
