package com.unifacisa.hospitalTurma3.repositories;

import com.unifacisa.hospitalTurma3.entities.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Integer> {
}
