package com.mikolaj.dao;

import com.mikolaj.builder.User;

import java.io.File;
import java.util.List;


public class Application {


        private static final String PATH = "C:\\Users\\Notek\\Desktop\\projekty\\DesignPatterns\\src\\users";
    public static void main(String[] args) {
        UserDao userDao = new UserDaoInFile(new File(PATH));
        userDao.addUser(User.builder()
        .firstName("Mikolaj")
        .lastName("Kowal")
        .age(27)
        .phoneNumber("123456789")
        .build());

        List<User> allUsers = userDao.getAllUsers();
        allUsers.forEach( e -> System.out.println(e));
//        allUsers.forEach(System.out::println);
    }
}
