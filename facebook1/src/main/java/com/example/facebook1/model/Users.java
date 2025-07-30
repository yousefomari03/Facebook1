package com.example.facebook1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
public class Users  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //@Column(nullable = false)
    private String name;
    //@Column(nullable = false)
    private String email;
    //@Column(nullable = false)
    private String password;
    //@Column(nullable = false)
    private LocalDate dateOfBirth;

    @JsonIgnore
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Post> postList ;



    public Users(Long id, LocalDate dateOfBirth, String password, String email, String name) {
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
        this.email = email;
        this.name = name;
    }


    public Users(String name, String email,String password, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
        this.email = email;

    }

    public Users() {
    }


}
