package com.example.treinamentobrastechback.model.entities;

import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name="tb_user")
public class User {
    @Column(name="name")
    private String name;
    @Column(name="birthDate")
    private Date birthDate;
    @Column(name="email")
    private String email;
    @Column(name="cpf")
    private String cpf;
    @Column(name="street")
    private String street;
    @Column(name="number")
    private double number;
    @Column(name="neighborhood")
    private String neighborhood;
    @Column(name="city")
    private String city;
    @Column(name="uf")
    private String uf;

    public User(String name, String cpf, String street, double number, String neighborhood, String city, String uf) {
        this.name = name;
        this.cpf = cpf;
        this.street = street;
        this.number = number;
        this.neighborhood = neighborhood;
        this.city = city;
        this.uf = uf;
    }
}
