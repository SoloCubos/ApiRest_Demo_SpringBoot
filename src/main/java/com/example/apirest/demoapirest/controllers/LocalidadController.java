package com.example.apirest.demoapirest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apirest.demoapirest.entities.Localidad;
import com.example.apirest.demoapirest.services.impl.LocalidadServiceImpl;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl>{
    
    @Autowired
    private LocalidadServiceImpl localidadServiceImpl;

}
