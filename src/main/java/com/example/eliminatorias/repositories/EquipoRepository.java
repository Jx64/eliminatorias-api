package com.example.eliminatorias.repositories;

import com.example.eliminatorias.entities.Equipo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipoRepository extends BaseRepository<Equipo, Long> {

    @Query(
            value = "SELECT * FROM equipo WHERE equipo.nombre LIKE %:nombre%",
            nativeQuery = true
    )
    List<Equipo> search(@Param("nombre") String nombre);
}
