package com.mikolaj.builder;


public class Application {

    public static void main(String[] args) {

        User user = User.builder()
                .firstName("Mikolaj")
                .lastName("Kowal")
                .phoneNumber("987654321")
                .age(27)
                .build();

        System.out.println(user);
    }
}
