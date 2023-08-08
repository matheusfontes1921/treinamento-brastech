package com.example.treinamentobrastechback.model.services;
import com.example.treinamentobrastechback.model.entities.*;
import com.example.treinamentobrastechback.model.repositories.UserRepository;

import java.util.*;

import org.springframework.http.ResponseEntity;
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseEntity<?> listarUsers() {
        List<User> users = userRepository.findAll();
        if(users.isEmpty()) {
            return ResponseEntity.badRequest().body("Não existem usuários cadastrados");
        } else {
            return ResponseEntity.badRequest().body(users);
        }
    }
    public ResponseEntity<?> createUser(User user) {
        if(userRepository.findById(user.getId()).isPresent()) {
            return ResponseEntity.badRequest().body("ERROR! User already created");
        } else {
            userRepository.save(user);
            return ResponseEntity.ok().body("User created!");
        }
    }
    public ResponseEntity<?> findById(Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            User objUser = user.get();
            return ResponseEntity.ok().body(objUser);
        } else {
            return ResponseEntity.badRequest().body("USER NOT FOUND");
        }
    }
}
