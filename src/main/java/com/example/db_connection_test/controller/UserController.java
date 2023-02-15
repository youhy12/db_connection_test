package com.example.db_connection_test.controller;

import com.example.db_connection_test.model.User;
import com.example.db_connection_test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @PostMapping("/user")
    public User create(@RequestBody User user){
        return userRepository.save(user);
    }
    @GetMapping("/user/{id}")
    public String read(@PathVariable String id){
        Optional<User> userOptional = userRepository.findById(id);
        userOptional.ifPresent(System.out::println);

        return "successfully executed";
    }

}
