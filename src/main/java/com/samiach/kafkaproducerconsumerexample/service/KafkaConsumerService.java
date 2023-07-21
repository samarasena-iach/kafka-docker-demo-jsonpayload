package com.samiach.kafkaproducerconsumerexample.service;

import com.samiach.kafkaproducerconsumerexample.model.Animal;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "animal_topic", groupId = "Group100", containerFactory = "animalListener")
    public void listen(Animal animal) {
        System.out.println("Received " + animal + " from the topic!");
    }

}
