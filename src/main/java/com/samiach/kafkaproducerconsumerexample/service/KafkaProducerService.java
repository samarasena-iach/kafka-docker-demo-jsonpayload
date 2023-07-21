package com.samiach.kafkaproducerconsumerexample.service;

import com.samiach.kafkaproducerconsumerexample.model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    @Autowired
    private KafkaTemplate<String, Animal> kafkaTemplate;

    private final static String TOPIC_NAME = "animal_topic";

    public void sendMessage(Animal animal) {
        kafkaTemplate.send(TOPIC_NAME, animal);
    }
}
