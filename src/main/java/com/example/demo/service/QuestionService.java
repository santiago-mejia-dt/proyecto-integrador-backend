package com.example.demo.service;

import com.example.demo.dto.QuestionRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QuestionService {

    RestTemplate restTemplate;

    public QuestionService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String sendQuestion(QuestionRequest questionRequest) {
        String url = "http://0.0.0.0:8000/question";
        return restTemplate.postForObject(url, questionRequest, String.class);
    }
}
