package com.outlaystream.expensetracker.controller;

import com.outlaystream.expensetracker.model.Users;
import com.outlaystream.expensetracker.repository.UserRepository;
import com.outlaystream.expensetracker.service.MyUserDetailsService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController// Specify the base path for this controller
public class UserController {


    private final UserRepository userRepository;
    private final MyUserDetailsService userService;

    public UserController(UserRepository userRepository, MyUserDetailsService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<Users>> getAllUser() { // Change return type to List<User>
        return ResponseEntity.ok(userRepository.findAll());
    }

    @PostMapping("/register")
    public Users register(@RequestBody Users user) {
        return userService.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody Users user) {
        try {
            userService.loadUserByUsername(user.getUsername());
            return "Login success";
        }
        catch(UsernameNotFoundException exception) {
            return "Login failed";
        }

    }
}
