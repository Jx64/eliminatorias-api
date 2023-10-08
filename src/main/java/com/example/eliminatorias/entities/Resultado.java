package com.example.eliminatorias.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "resultados")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Resultado extends Base {

    @PositiveOrZero
    @Column(name = "golesVisitante", nullable = false)
    private int golesVisitante;

    @PositiveOrZero
    @Column(name = "golesLocal", nullable = false)
    private int golesLocal;

    @PositiveOrZero
    @Column(name = "numeroTarjetasRojas", nullable = false)
    private int numeroTarjetasRojas;

    @PositiveOrZero
    @Column(name = "numeroTarjetasAmarillas", nullable = false)
    private int numeroTarjetasAmarillas;

    @OneToOne(mappedBy = "marcador")
    private Partido partido;
}
