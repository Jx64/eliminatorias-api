package com.example.eliminatorias.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.time.LocalDate;

@Entity
@Table(name = "partidos")
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
    @JoinColumn(name = "idEquipolocal")
    private Equipo equipoLocal;

    @ManyToOne()
    @JoinColumn(name = "idEquipoVisitante")
    private Equipo equipoVisitante;

    @OneToOne(optional = false)
    @JoinColumn(name = "fk_marcador", referencedColumnName = "id")
    private Resultado marcador;
}
