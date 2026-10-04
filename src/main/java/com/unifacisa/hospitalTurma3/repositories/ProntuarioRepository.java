package com.unifacisa.hospitalTurma3.repositories;


import com.unifacisa.hospitalTurma3.entities.Prontuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProntuarioRepository extends JpaRepository<Prontuario, Integer> {
}
