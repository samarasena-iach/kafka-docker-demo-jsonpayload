package com.samiach.kafkaproducerconsumerexample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Animal {
    private String name;
    private String color;
    private String animalType;
}
