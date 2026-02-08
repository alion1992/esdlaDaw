package com.daw.esdla.repository;

import com.daw.esdla.model.Partida;
import com.daw.esdla.model.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartidaRepository extends JpaRepository<Partida, Long> {
}
