package com.example.facebook1.services;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Reaction {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;


}
