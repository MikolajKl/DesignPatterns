package com.mikolaj.dao;

import com.mikolaj.builder.User;

import java.util.List;

/**
 * Created by Notek on 2017-06-05.
 */
public interface UserDao {    // Dao - data access object
    List<User> getAllUsers();

    void addUser(User user);
}
