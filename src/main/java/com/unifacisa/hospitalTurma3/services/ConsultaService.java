package com.unifacisa.hospitalTurma3.services;

import com.unifacisa.hospitalTurma3.entities.Consulta;
import com.unifacisa.hospitalTurma3.repositories.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultaService {

    @Autowired
    private ConsultaRepository consultaRepository;

    public Consulta cadastrarConsulta(Consulta consulta){
        return consultaRepository.save(consulta);
    }

    public List<Consulta> listarConsultas(){
        return consultaRepository.findAll();
    }

    public Consulta atualizarConsulta(Integer id, Consulta dados){
        Consulta consulta = consultaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Consulta não encontrada"));
        consulta.setDataHora(dados.getDataHora());
        consulta.setDescricao(dados.getDescricao());
        return consultaRepository.save(consulta);
    }

    public void deletarConsulta(Integer id){
        if (!consultaRepository.existsById(id)) {
            throw new RuntimeException("Consulta não encontrada");
        }
        consultaRepository.deleteById(id);
    }
}
