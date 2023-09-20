package com.example.eliminatorias.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.io.Serializable;

@Entity
@Table(name = "Equipo")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Equipo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre",nullable = false, unique = true)
    private String nombre;

    @Column(name = "bandera", nullable = false)
    private String bandera;

    @Column(name = "tecnico", nullable = false)
    private String directorTecnico;
}
