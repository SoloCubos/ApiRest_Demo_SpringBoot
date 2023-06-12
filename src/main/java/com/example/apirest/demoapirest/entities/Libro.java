package com.example.apirest.demoapirest.entities;

import java.util.Date;

import org.hibernate.envers.Audited;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "libro")
@Entity
@Audited
public class Libro extends Base{
    
    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "genero")
    private String genero;

    @Column(name = "paginas")
    private Integer paginas;

    @Column(name = "titulo")
    private String titulo;

}
