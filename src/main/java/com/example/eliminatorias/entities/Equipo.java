package com.example.eliminatorias.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Entity
@Table(name = "Equipo")
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

    //El siguiente codigo debe utilizarse un actualizador que cuente en la tabla Partidos
    // la cantidad de veces que un equipo juega de local o visitante.
    /*@OneToMany(cascade = CascadeType.ALL, orphanRemoval = false)
    @JoinTable(
            name = "equipo_partido",
            joinColumns = @JoinColumn(name = "equipo_id"),
            inverseJoinColumns = @JoinColumn(name = "partido_id")
    )
    private List<Partido> partidosJugados = new ArrayList<Partido>();*/


}
