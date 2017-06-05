package com.mikolaj.dao;

import com.mikolaj.builder.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Notek on 2017-06-05.
 */
public class UserDaoInMemory implements UserDao {

    private List<User> users;

    public UserDaoInMemory(){
        users = new ArrayList<>();
        users.add(User.builder()
                .firstName("Mikolaj")
                .lastName("Kowal")
                .age(27)
                .phoneNumber("123456789")
                .build());
        users.add(User.builder()
                .firstName("Jan")
                .lastName("Kowalski")
                .age(25)
                .phoneNumber("98765432")
                .build());
        users.add(User.builder()
                .firstName("Eryk")
                .lastName("Nowak")
                .age(23)
                .phoneNumber("5432198876")
                .build());

    }
    @Override
    public List<User> getAllUsers() {
        return users;  // zwracamy użytkowników
    }

    @Override
    public void addUser(User user) {
           users.add(user); // dodajemy użytkowników
    }
}
