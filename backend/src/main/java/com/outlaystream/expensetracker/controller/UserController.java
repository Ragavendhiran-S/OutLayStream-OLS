package com.outlaystream.expensetracker.controller;

import com.outlaystream.expensetracker.model.User;
import com.outlaystream.expensetracker.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users") // Specify the base path for this controller
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUser() { // Change return type to List<User>
        return ResponseEntity.ok(userRepository.findAll());
    }
}
