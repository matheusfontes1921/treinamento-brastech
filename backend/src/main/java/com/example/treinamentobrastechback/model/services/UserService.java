package com.example.treinamentobrastechback.model.services;

import com.example.treinamentobrastechback.model.entities.*;
import com.example.treinamentobrastechback.model.repositories.*;
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
        if(userRepository.findById(user.getCpf()).isPresent()) {
            return ResponseEntity.badRequest().body("ERROR! User already created");
        } else {
            userRepository.save(user);
            return ResponseEntity.ok().body("User created!");
        }
    }
    public ResponseEntity<?> findById(Long cpf) {
        Optional<User> user = userRepository.findById(cpf);
        if (user.isPresent()) {
            return ResponseEntity.ok().body(user.get());
        } else {
            return ResponseEntity.badRequest().body("USER NOT FOUND");
        }
    }
    public ResponseEntity<?> removeUser(Long cpf) {
        Optional<User> user = userRepository.findById(cpf);
        if (user.isPresent()) {
            userRepository.deleteById(cpf);
            return ResponseEntity.ok().body("USER DELETED!");
        } else {
            return ResponseEntity.badRequest().body("USER NOT FOUND");
        }
    }
    public ResponseEntity<?> editUser(Long cpf, User newUser) {
        Optional<User> user = userRepository.findById(cpf);
        if(user.isPresent()) {
            var userObj = user.get();
            userObj.setName(newUser.getName());
            userObj.setEmail(newUser.getEmail());
            userObj.setZipCode(newUser.getZipCode());
            userObj.setStreet(newUser.getStreet());
            userObj.setNumber(newUser.getNumber());
            userObj.setNeighborhood(newUser.getNeighborhood());
            userObj.setCity(newUser.getCity());
            userObj.setUf(newUser.getUf()); 
            return ResponseEntity.ok().body(userObj);             
        } 
        return ResponseEntity.badRequest().body("USER NOT FOUND");
    }
}
