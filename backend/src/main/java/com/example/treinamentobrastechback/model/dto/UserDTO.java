package com.example.treinamentobrastechback.model.dto;

import java.util.Date;

public class UserDTO {
    private Long id;
    private String name;
    private Date birthDate;
    private String email;
    private String cpf;
    private String street;
    private double number;
    private String neighborhood;
    private String city;
    private String uf;
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public String getEmail(){
        return email;
    }
    public String getCpf() {
        return cpf;
    }
    public String getStreet() {
        return street;
    }
    public double getNumber() {
        return number;
    }
    public String getNeighborhood() {
        return neighborhood;
    }
    public String getCity() {
        return city;
    }
    public String getUf() {
        return uf;
    }
}
