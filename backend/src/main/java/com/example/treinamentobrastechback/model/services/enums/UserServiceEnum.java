package com.example.treinamentobrastechback.model.services.enums;

import lombok.Getter;

@Getter
public enum UserServiceEnum {
    USER_NOT_FOUND("USER NOT FOUND"),
    NO_USERS("There aren't users created"),
    USER_ALREADY_CREATED("ERROR! User already created"),
    SUCCESS_USER_CREATED("User created!"),
    SUCCESS_USER_DELETED("User deleted!");
    private final String frase;
    private UserServiceEnum(String frase) {
        this.frase=frase;
    }
}
