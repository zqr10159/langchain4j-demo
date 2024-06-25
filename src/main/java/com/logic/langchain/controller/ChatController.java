package com.logic.langchain.controller;

import com.logic.langchain.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {
    @Autowired
    private ChatService chatService;

    @GetMapping("/chat")
    public String chat(String message) {
        return chatService.chat(message);
    }
}
