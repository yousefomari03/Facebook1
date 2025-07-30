package com.example.facebook1.services;

import com.example.facebook1.DTOs.PostRequestDTO;
import com.example.facebook1.DTOs.PostResponseDTO;
import com.example.facebook1.model.Post;
import com.example.facebook1.model.Users;
import com.example.facebook1.reposetry.PostReposetry;
import com.example.facebook1.reposetry.UsersReposetry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static java.awt.SystemColor.text;

@Service
public class PostServices {
    private final PostReposetry postReposetry;
    private final UsersReposetry usersReposetry;

    @Autowired
    public PostServices(PostReposetry postReposetry, UsersReposetry usersReposetry) {
        this.postReposetry = postReposetry;
        this.usersReposetry = usersReposetry;
    }

    public PostResponseDTO createPost(PostRequestDTO DTO) {
        Optional <Users> user = usersReposetry.findById(DTO.getUserId());
        Post post = new Post(DTO.getText());
        post.setUser(user.get());
        postReposetry.save(post);
        return new PostResponseDTO(post);

    }

    public PostResponseDTO findPostById(Long postId) {

        Optional<Post> post = postReposetry.findById(postId);

        PostResponseDTO Response = new PostResponseDTO(post.get());
        Response.setText(post.get().getText());
        Response.setPostId(post.get().getPostId());
        Response.setName(post.get().getUser().getName());
        Response.setUserId(post.get().getUser().getId());
        return Response;
    }








}



