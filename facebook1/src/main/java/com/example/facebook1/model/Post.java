package com.example.facebook1.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;
    private String text;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    public Post(Long postId, String text, Users user) {
        this.postId = postId;
        this.text = text;
        this.user = user;

    }

    public Post() {
    }

    public Post(String text) {
        this.text = text;
    }



}
