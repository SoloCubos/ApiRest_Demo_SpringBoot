package com.example.apirest.demoapirest.entities;

import org.hibernate.envers.Audited;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "domicilio")
@Audited
public class Domicilio extends Base{
    
    @Column(name = "calle")
    private String calle;

    @Column(name = "numero")
    private Integer numero;

}
