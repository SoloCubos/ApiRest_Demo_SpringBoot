package com.example.apirest.demoapirest.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.envers.Audited;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "persona")
@Getter
@Setter
@Audited
public class Persona extends Base{

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name =  "cedula")
    private String cedula;

}
