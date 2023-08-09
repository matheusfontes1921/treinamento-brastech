package com.example.treinamentobrastechback.model.entities;

import java.util.Date;
import com.example.treinamentobrastechback.model.dto.UserDTO;
import jakarta.persistence.*;
import lombok.*;
@Getter
@Setter
@Entity
@Table(name="tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cpf")
    private Long cpf;
    @Column(name="name")
    private String name;
    @Column(name="birthDate")
    private Date birthDate;
    @Column(name="email")
    private String email;
    @Column(name="zipCode")
    private String zipCode;
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

    public User(UserDTO userDTO) {
        this.name = userDTO.getName();
        this.cpf = userDTO.getCpf();
        this.street = userDTO.getStreet();
        this.number = userDTO.getNumber();
        this.neighborhood = userDTO.getNeighborhood();
        this.city = userDTO.getCity();
        this.uf = userDTO.getUf();
    }
}
