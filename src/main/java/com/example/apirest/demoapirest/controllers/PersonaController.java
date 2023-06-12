package com.example.apirest.demoapirest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apirest.demoapirest.entities.Persona;
import com.example.apirest.demoapirest.services.impl.PersonaServiceImpl;
//@Controller
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{

    @Autowired
    private PersonaServiceImpl personaServiceImpl;

    
}
