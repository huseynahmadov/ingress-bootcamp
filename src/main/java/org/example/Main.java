package org.example;

import org.example.designpatterns.User;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder("John", "Doe")
                .age(30)
                .phone("1234567")
                .address("Fake address 1234")
                .build();

        System.out.println(user);
    }
}