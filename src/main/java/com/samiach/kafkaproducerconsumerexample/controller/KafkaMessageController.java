package com.samiach.kafkaproducerconsumerexample.controller;

import com.samiach.kafkaproducerconsumerexample.model.Animal;
import com.samiach.kafkaproducerconsumerexample.service.KafkaProducerService;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka_test")
public class KafkaMessageController {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @Bean
    public NewTopic adviceTopic() {
        System.out.println("Created topic : animal_topic");
        return new NewTopic("animal_topic", 3, (short) 1);
    }

    @PostMapping("/publish")
    public String publishMessage(@RequestBody Animal animal) {
        kafkaProducerService.sendMessage(animal);

        String message = "Successfully published record [" + animal + "] to the topic!";
        System.out.println(message);
        return message;
    }

}
