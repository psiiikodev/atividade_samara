package com.unifacisa.hospitalTurma3.services;

import com.unifacisa.hospitalTurma3.entities.Consulta;
import com.unifacisa.hospitalTurma3.entities.Prontuario;
import com.unifacisa.hospitalTurma3.repositories.ConsultaRepository;
import com.unifacisa.hospitalTurma3.repositories.ProntuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProntuarioService {

    @Autowired
    private ProntuarioRepository prontuarioRepository;

    public Prontuario cadastrarProntuario(Prontuario prontuario){
        return prontuarioRepository.save(prontuario);
    }

    public List<Prontuario> listarProntuario(){
        return prontuarioRepository.findAll();
    }

    public Prontuario atualizarProntuario(Integer id, Prontuario dados){
        Prontuario prontuario = prontuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Prontuário não encontrado"));
        prontuario.setHistorico(dados.getHistorico());
        prontuario.setDescricao(dados.getDescricao());
        return prontuarioRepository.save(prontuario);
    }

    public void deletarProntuario(Integer id){
        if (!prontuarioRepository.existsById(id)) {
            throw new RuntimeException("Prontuário não encontrado");
        }
        prontuarioRepository.deleteById(id);
    }
}
