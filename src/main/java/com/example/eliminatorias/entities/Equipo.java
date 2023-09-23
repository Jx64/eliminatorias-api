package com.example.eliminatorias.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "equipos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Equipo extends Base implements Serializable {

    @Column(name = "nombre",nullable = false, unique = true)
    private String nombre;

    @Column(name = "bandera", nullable = false)
    private String bandera;

    @Column(name = "tecnico", nullable = false)
    private String directorTecnico;

    @OneToMany(mappedBy = "equipoLocal")
    private Set<Partido> partidosLocal;

    @OneToMany(mappedBy = "equipoVisitante")
    private Set<Partido> partidosVisitante;
}
