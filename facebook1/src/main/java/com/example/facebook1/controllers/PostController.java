package com.example.facebook1.controllers;

import com.example.facebook1.DTOs.PostRequestDTO;
import com.example.facebook1.DTOs.PostResponseDTO;
import com.example.facebook1.model.Post;
import com.example.facebook1.services.PostServices;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/post")
@RestController
public class PostController {
    private final PostServices postServices;

    public PostController(PostServices postServices) {
        this.postServices = postServices;
    }

    @PostMapping
    public PostResponseDTO createPost(@RequestBody PostRequestDTO postRequestDTO) {
        return postServices.createPost(postRequestDTO);
    }
    @GetMapping("{id}")
    public PostResponseDTO findPostById(@PathVariable Long id) {
        return postServices.findPostById(id);

    }


}
