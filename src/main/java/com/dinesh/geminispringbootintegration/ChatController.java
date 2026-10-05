package com.dinesh.geminispringbootintegration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    @Autowired
    private ChatService chatService;

    @GetMapping("/chat")
    public String index(@RequestParam String prompt) {
        return chatService.chat(prompt);
    }
}
