package com.unifacisa.hospitalTurma3.services;

import com.unifacisa.hospitalTurma3.entities.Paciente;
import com.unifacisa.hospitalTurma3.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public Paciente salvarPaciente(Paciente paciente){
        return pacienteRepository.save(paciente);
    }

    public List<Paciente> listarPacientes(){
        return pacienteRepository.findAll();
    }

    public Paciente atualizarPaciente(Integer id, Paciente dados){
        Paciente paciente = pacienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Paciente não encontrado"));
        paciente.setNome(dados.getNome());
        paciente.setTelefone(dados.getTelefone());
        paciente.setEndereco(dados.getEndereco());
        return pacienteRepository.save(paciente);
    }

    public void deletarPaciente(Integer id){
        if (!pacienteRepository.existsById(id)) {
            throw new RuntimeException("Paciente não encontrado");
        }
        pacienteRepository.deleteById(id);
    }

}
