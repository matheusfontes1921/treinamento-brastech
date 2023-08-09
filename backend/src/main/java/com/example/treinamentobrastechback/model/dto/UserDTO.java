package com.example.treinamentobrastechback.model.dto;
import java.util.Date;
import lombok.*;
@Getter
@Setter
public class UserDTO {
    private String name;
    private Date birthDate;
    private String email;
    private Long cpf;
    private String street;
    private double number;
    private String neighborhood;
    private String city;
    private String uf;
}
