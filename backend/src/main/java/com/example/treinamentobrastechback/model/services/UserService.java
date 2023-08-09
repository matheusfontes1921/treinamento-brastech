package com.example.treinamentobrastechback.model.services;

import com.example.treinamentobrastechback.model.entities.*;
import com.example.treinamentobrastechback.model.repositories.*;
import com.example.treinamentobrastechback.model.services.enums.UserServiceEnum;
import java.util.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseEntity<?> listarUsers() {
        List<User> users = userRepository.findAll();
        if(users.isEmpty()) {
            return ResponseEntity.badRequest().body(UserServiceEnum.NO_USERS);
        } else {
            return ResponseEntity.badRequest().body(users);
        }
    }
    public ResponseEntity<?> createUser(User user) {
        if(userRepository.findById(user.getCpf()).isPresent()) {
            return ResponseEntity.badRequest().body(UserServiceEnum.USER_ALREADY_CREATED);
        } else {
            userRepository.save(user);
            return ResponseEntity.ok().body(UserServiceEnum.SUCCESS_USER_CREATED);
        }
    }
    public ResponseEntity<?> findById(Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            return ResponseEntity.ok().body(user.get());
        } else {
            return ResponseEntity.badRequest().body(UserServiceEnum.USER_NOT_FOUND);
        }
    }
    public ResponseEntity<?> removeUser(Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            userRepository.deleteById(id);
            return ResponseEntity.ok().body(UserServiceEnum.SUCCESS_USER_DELETED);
        } else {
            return ResponseEntity.badRequest().body(UserServiceEnum.USER_NOT_FOUND);
        }
    }
    public ResponseEntity<?> editUser(Long id, User newUser) {
        Optional<User> user = userRepository.findById(id);
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
        return ResponseEntity.badRequest().body(UserServiceEnum.USER_NOT_FOUND);
    }
}
