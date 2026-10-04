package com.unifacisa.hospitalTurma3.repositories;

import com.unifacisa.hospitalTurma3.entities.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer> {
}
