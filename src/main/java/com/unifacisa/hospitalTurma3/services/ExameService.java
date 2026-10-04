package com.unifacisa.hospitalTurma3.services;

import com.unifacisa.hospitalTurma3.entities.Consulta;
import com.unifacisa.hospitalTurma3.entities.Exame;
import com.unifacisa.hospitalTurma3.repositories.ConsultaRepository;
import com.unifacisa.hospitalTurma3.repositories.ExameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExameService {

    @Autowired
    private ExameRepository exameRepository;

    public Exame cadastrarExame(Exame exame){
        return exameRepository.save(exame);
    }

    public List<Exame> listarExames(){
        return exameRepository.findAll();
    }

    public Exame atualizarExame(Integer id, Exame dados){
        Exame exame = exameRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Exame não encontrado"));
        exame.setNome(dados.getNome());
        exame.setTipo(dados.getTipo());
        return exameRepository.save(exame);
    }

    public void deletarExame(Integer id){
        if (!exameRepository.existsById(id)) {
            throw new RuntimeException("Exame não encontrado");
        }
        exameRepository.deleteById(id);
    }
}
