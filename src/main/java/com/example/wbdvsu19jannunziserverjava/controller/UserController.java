package com.example.wbdvsu19jannunziserverjava.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.wbdvsu19jannunziserverjava.models.User;

@RestController
public class UserController implements AAA {
    static List<User> users = new ArrayList<User>();
    static {
        users.add(new User(123, "alice", "Alice"));
        users.add(new User(234, "bob", "Bob"));
        users.add(new User(345, "charlie", "Charlie"));
        users.add(new User(456, "dan", "Dan"));
    }
    // CRUD
    
    // POST - Creating 
    @PostMapping("/users")
    public List<User> createUser(@RequestBody User user) {
        users.add(user);
        return users;
    }
    
    // GET - Reading
    @GetMapping("/users")
    public List<User> findAllUsers() {
        return users;
    }

    @Override
    public String hello() {
        return null;
    }
    // UPDATE - Updating
    // DELETE - Deleting
}
