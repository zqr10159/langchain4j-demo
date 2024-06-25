package com.logic.langchain.service;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface ChatService {
    @SystemMessage("You are a useful assistant")
    String chat(String userMessage);
}
