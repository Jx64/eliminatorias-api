package com.example.eliminatorias.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "partido")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Partido extends Base{

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @Column(name = "estadio", nullable = false)
    private String estadio;

    @Column(name = "arbitro", nullable = false)
    private String arbitro;

    @ManyToOne()
    @JoinColumn(name = "fk_local")
    private Equipo equipoLocal;

    @ManyToOne()
    @JoinColumn(name = "fk_visitante")
    private Equipo equipoVisitante;
}
