package com.example.facebook1.DTOs;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostRequestDTO {
    private String text;
    private Long userId;


    public PostRequestDTO(String text, Long userId) {
        this.text = text;
        this.userId = userId;
    }
}
