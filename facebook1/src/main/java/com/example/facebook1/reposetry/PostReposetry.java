package com.example.facebook1.reposetry;

import com.example.facebook1.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PostReposetry extends JpaRepository<Post, Long> {

    Optional<Post> findById(Long id);


    List<Post> findPostByUserId(Long userId);
}
