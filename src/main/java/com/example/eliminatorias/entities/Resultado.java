package com.example.eliminatorias.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "resultado")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Resultado extends Base {

    @Column(name = "golesVisitante", nullable = false)
    private int golesVisitante;

    @Column(name = "golesLocal", nullable = false)
    private int golesLocal;

    @Column(name = "numeroTarjetasRojas", nullable = false)
    private int numeroTarjetasRojas;

    @Column(name = "numeroTarjetasAmarillas", nullable = false)
    private int numeroTarjetasAmarillas;
}
