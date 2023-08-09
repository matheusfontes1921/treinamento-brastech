package com.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.treinamentobrastechback.model.services.UserService;
import com.example.treinamentobrastechback.model.entities.User;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService=userService;
    }
    @GetMapping
    public ResponseEntity<?> listarUsers() {
        return userService.listarUsers();
    }
    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> findUserById(@PathVariable Long id) {
        return userService.findById(id);
    }
    @DeleteMapping("/remover/{id}")
    public ResponseEntity<?> removeUser(@PathVariable Long id) {
        return userService.removeUser(id);
    }

}
