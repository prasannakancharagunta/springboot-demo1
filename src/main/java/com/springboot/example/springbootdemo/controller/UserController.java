package com.springboot.example.springbootdemo.controller;


import com.springboot.example.springbootdemo.entity.UserRepository;
import com.springboot.example.springbootdemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/user/{id}")
    public User getUser(@PathVariable("id") String id){
        User user = userRepository.findById(id).get();
        return  user;
    }

    @PostMapping(path = "/user")
    public User addUser(@RequestBody User user){
        return userRepository.save(user);
    }
}
