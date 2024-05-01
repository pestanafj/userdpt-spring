package com.pestanafj.userdpt.controllers;

import java.util.List;

import com.pestanafj.userdpt.repositories.UserRepository;
import com.pestanafj.userdpt.entities.User;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@RestController
@RequestMapping(value="/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> findAll() {
        List<User> result = repository.findAll();
        return result;
    }

    @GetMapping(value ="/{id}")
    public User findById(@PathVariable Long id) {
        User result = repository.findById(id).get();
        return result;
    }

    @PostMapping
    public User insert(@RequestBody User user) {
        User result = repository.save(user);
        return result;
    }

    @DeleteMapping
    public void deleteAll() {
        repository.deleteAll();
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Long id) {
        repository.delete(repository.findById(id).get());
    }
}
