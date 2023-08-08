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
}
