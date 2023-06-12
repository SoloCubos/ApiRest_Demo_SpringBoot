package com.example.apirest.demoapirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apirest.demoapirest.entities.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer>{
    


}