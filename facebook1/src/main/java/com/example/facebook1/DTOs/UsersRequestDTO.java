package com.example.facebook1.DTOs;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class UsersRequestDTO {
    private String name;
    private String email;
    private String Password;
    private LocalDate  dateOfBirth;

    public UsersRequestDTO(String name, LocalDate dateOfBirth, String email, String password) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        Password = password;
    }
}
