package com.example.facebook1.services;

import com.example.facebook1.DTOs.PostResponseDTO;
import com.example.facebook1.DTOs.UsersRequestDTO;
import com.example.facebook1.DTOs.UsersResponseDTO;
import com.example.facebook1.model.Post;
import com.example.facebook1.model.Users;
import com.example.facebook1.reposetry.UsersReposetry;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsersServices {
    private final UsersReposetry usersReposetry;

    public UsersServices(UsersReposetry usersReposetry) {
        this.usersReposetry = usersReposetry;

    }

    public UsersResponseDTO createUser(UsersRequestDTO DTO) {
        Users users = new Users(DTO.getName(), DTO.getEmail(), DTO.getPassword(), DTO.getDateOfBirth());
        usersReposetry.save(users);

        UsersResponseDTO usersResponseDTO = new UsersResponseDTO();
        usersResponseDTO.setName(DTO.getName());
        usersResponseDTO.setEmail(DTO.getEmail());
        usersResponseDTO.setDateOfBirth(DTO.getDateOfBirth());
        return usersResponseDTO;


    }

    public List<UsersResponseDTO> getallUsers() {


        List<Users> users = usersReposetry.findAll();
        List<UsersResponseDTO> usersResponseDTOs = new ArrayList<>();

        for (Users user : users) {
            UsersResponseDTO dto = new UsersResponseDTO();
            dto.setName(user.getName());
            dto.setEmail(user.getEmail());
            dto.setDateOfBirth(user.getDateOfBirth());
            usersResponseDTOs.add(dto);
        }

        return usersResponseDTOs;


    }

    public UsersResponseDTO findUserById(Long id) {
        Optional<Users> users = usersReposetry.findById(id);
        UsersResponseDTO usersResponseDTO = new UsersResponseDTO();
        usersResponseDTO.setName(users.get().getName());
        usersResponseDTO.setEmail(users.get().getEmail());
        usersResponseDTO.setDateOfBirth(users.get().getDateOfBirth());
        return usersResponseDTO;

    }



}



