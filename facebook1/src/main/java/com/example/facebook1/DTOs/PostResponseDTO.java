package com.example.facebook1.DTOs;


import com.example.facebook1.model.Post;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostResponseDTO {
    private String text;
    private Long userId;
    private Long postId;
    private String name;

    public PostResponseDTO(String text, String name, Long postId, Long userId) {
        this.text = text;
        this.name = name;
        this.postId = postId;
        this.userId = userId;
    }
    public PostResponseDTO(Post post) {
        this.text = post.getText();
        this.postId = post.getPostId();
        this.userId=post.getUser().getId();
        this.name=post.getUser().getName();

    }


    public PostResponseDTO(String text, Long postId, Long id, String name) {
        this.text = text;
        this.postId = postId;
        this.userId = id;
        this.name=name;
    }
}
