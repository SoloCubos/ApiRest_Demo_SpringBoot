package com.example.apirest.demoapirest.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apirest.demoapirest.entities.Autor;
import com.example.apirest.demoapirest.services.impl.AutorServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path ="/autores ")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl>{
    
}
