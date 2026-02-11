package com.daw.esdla.repository;

import com.daw.esdla.model.Partida;
import com.daw.esdla.model.PortadorAnillo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortadoresRepository extends JpaRepository<PortadorAnillo, Long> {
}
