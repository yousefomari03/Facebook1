package com.example.facebook1.reposetry;

import com.example.facebook1.DTOs.UsersResponseDTO;
import com.example.facebook1.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersReposetry extends JpaRepository<Users, Long> {

    Optional <Users> findById(Long id);


}
