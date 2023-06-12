package com.example.apirest.demoapirest.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apirest.demoapirest.entities.Autor;
import com.example.apirest.demoapirest.repositories.AutorRepository;
import com.example.apirest.demoapirest.repositories.BaseRepository;
import com.example.apirest.demoapirest.services.AutorService;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Integer> implements AutorService{

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Integer> baseRepository) {
        super(baseRepository);
    }
    
    
}
