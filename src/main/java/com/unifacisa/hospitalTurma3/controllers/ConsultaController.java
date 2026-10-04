package com.unifacisa.hospitalTurma3.controllers;

import com.unifacisa.hospitalTurma3.entities.Consulta;
import com.unifacisa.hospitalTurma3.services.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {

    @Autowired
    private ConsultaService consultaService;

    @PostMapping
    public Consulta cadastrarConsulta(@RequestBody Consulta consulta){
        return consultaService.cadastrarConsulta(consulta);
    }

    @GetMapping
    public List<Consulta> listarConsultas(){
        return consultaService.listarConsultas();
    }

    @PutMapping("/{id}")
    public Consulta atualizarConsulta(@PathVariable Integer id, @RequestBody Consulta consulta){
        return consultaService.atualizarConsulta(id, consulta);
    }

    @DeleteMapping("/{id}")
    public void deletarConsulta(@PathVariable Integer id){
        consultaService.deletarConsulta(id);
    }
}
