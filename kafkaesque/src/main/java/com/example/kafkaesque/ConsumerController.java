package com.example.kafkaesque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/kafka")
public class ConsumerController {
    private final ConsumerService consumerService;

    @Autowired
    public ConsumerController(ConsumerService consumerService){
        this.consumerService = consumerService;
    }

    @GetMapping("/consume")
    public ResponseEntity<List<String>> consumeMessages() {
        return ResponseEntity.ok(this.consumerService.getMessages());
    }
}