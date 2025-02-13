package com.example.kafkaesque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class KafkaesqueApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaesqueApplication.class, args);
	}

}
