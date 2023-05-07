package org.example;

import org.example.designpatterns.builder.BuilderPattern;

public class Main {
    public static void main(String[] args) {
        BuilderPattern builderPattern = new BuilderPattern.UserBuilder("John", "Doe")
                .age(30)
                .phone("1234567")
                .address("Fake address 1234")
                .build();

        System.out.println(builderPattern);
    }
}