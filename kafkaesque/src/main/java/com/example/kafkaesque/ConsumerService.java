package com.example.kafkaesque;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConsumerService {
    private final List<String> messages = new ArrayList<>();

    @KafkaListener(topics = "franz-kafka", groupId = "group_id")
    public void listen(String message) {
        messages.add(message);
        System.out.println("Received Message: " + message);
    }

    public List<String> getMessages(){
        return this.messages;
    }
}
