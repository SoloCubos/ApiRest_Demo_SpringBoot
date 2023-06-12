package com.example.apirest.demoapirest.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apirest.demoapirest.entities.Localidad;
import com.example.apirest.demoapirest.repositories.BaseRepository;
import com.example.apirest.demoapirest.repositories.LocalidadRepository;
import com.example.apirest.demoapirest.services.LocalidadService;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Integer> implements LocalidadService{

    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Integer> baseRepository) {
        super(baseRepository);
    }
}
