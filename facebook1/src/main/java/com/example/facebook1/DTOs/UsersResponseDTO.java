package com.example.facebook1.DTOs;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class UsersResponseDTO {
    private String email;
    private String name;
    private LocalDate dateOfBirth;


}
