package com.example.apirest.demoapirest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apirest.demoapirest.entities.Persona;
import com.example.apirest.demoapirest.repositories.PersonaRepository;

import jakarta.transaction.Transactional;

@Service
public class PersonaService implements BaseService<Persona>{

    @Autowired
    private PersonaRepository personaRepository;
    
    @Override
    @Transactional
    public List<Persona> findAll() throws Exception{
        try {
            List<Persona> personas = personaRepository.findAll();
            return personas;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Persona findById(Integer id) throws Exception{
        try {
            Optional<Persona> personaOptional = personaRepository.findById(id);
            return personaOptional.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Persona save(Persona entity) throws Exception{
        try {
            entity = personaRepository.save(entity);
            return entity;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Persona update(Integer id, Persona entity) throws Exception{
        try {
            Optional<Persona> personaOptional = personaRepository.findById(id);
            Persona persona = personaOptional.get();
            persona = personaRepository.save(persona);
            return persona;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Integer id)  throws Exception{
        try {
            if(personaRepository.existsById(id)){
                personaRepository.deleteById(id);
                return true;
            }else throw new Exception();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
