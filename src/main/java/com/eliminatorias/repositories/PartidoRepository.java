package com.eliminatorias.repositories;

import com.eliminatorias.entities.Partido;
import org.springframework.stereotype.Repository;

@Repository
public interface PartidoRepository extends BaseRepository<Partido, Long> {
}
