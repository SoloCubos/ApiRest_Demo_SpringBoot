package com.example.apirest.demoapirest.services.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apirest.demoapirest.entities.Persona;
import com.example.apirest.demoapirest.repositories.BaseRepository;
import com.example.apirest.demoapirest.repositories.PersonaRepository;
import com.example.apirest.demoapirest.services.PersonaService;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Integer> implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Integer> baseRepository) {
        super(baseRepository);
    }

}
