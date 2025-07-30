package com.example.facebook1.controllers;


import com.example.facebook1.DTOs.UsersRequestDTO;
import com.example.facebook1.DTOs.UsersResponseDTO;
import com.example.facebook1.model.Users;
import com.example.facebook1.services.UsersServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/users")
@RestController
public class UsersController {
    private final UsersServices usersServices;

    public UsersController(UsersServices usersServices) {
        this.usersServices = usersServices;
    }

    @PostMapping
    public UsersResponseDTO createUser(@RequestBody UsersRequestDTO RequestDTO) {
        return usersServices.createUser(RequestDTO);
    }

    @GetMapping
    public List<UsersResponseDTO> getAllUsers() {
        return usersServices.getallUsers();
    }

    @GetMapping("{id}")
    public UsersResponseDTO findUserById(@PathVariable Long id) {
        return usersServices.findUserById(id);
    }
    

}
