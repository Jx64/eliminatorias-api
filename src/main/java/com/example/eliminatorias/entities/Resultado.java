package com.example.eliminatorias.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
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

    @Size
    @PositiveOrZero
    @Column(name = "golesVisitante", nullable = false)
    private int golesVisitante;

    @Size
    @PositiveOrZero
    @Column(name = "golesLocal", nullable = false)
    private int golesLocal;

    @Size
    @PositiveOrZero
    @Column(name = "numeroTarjetasRojas", nullable = false)
    private int numeroTarjetasRojas;

    @Size
    @PositiveOrZero
    @Column(name = "numeroTarjetasAmarillas", nullable = false)
    private int numeroTarjetasAmarillas;

    @OneToOne(mappedBy = "marcador")
    private Partido partido;
}
