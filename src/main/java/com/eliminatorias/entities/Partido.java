package com.eliminatorias.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Table(name = "partidos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Partido extends Base{

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @NotBlank(message = "Estadio can't be blank")
    @Column(name = "estadio", nullable = false)
    private String estadio;

    @NotBlank(message = "Arbitro can't be blank")
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
