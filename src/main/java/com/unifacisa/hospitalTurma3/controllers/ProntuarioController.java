package com.unifacisa.hospitalTurma3.controllers;

import com.unifacisa.hospitalTurma3.entities.Consulta;
import com.unifacisa.hospitalTurma3.entities.Prontuario;
import com.unifacisa.hospitalTurma3.services.ConsultaService;
import com.unifacisa.hospitalTurma3.services.ProntuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prontuarios")
public class ProntuarioController {

    @Autowired
    private ProntuarioService prontuarioService;

    @PostMapping
    public Prontuario cadastrarProntuario(@RequestBody Prontuario prontuario){
        return prontuarioService.cadastrarProntuario(prontuario);
    }

    @GetMapping
    public List<Prontuario> listarProntuario(){
        return prontuarioService.listarProntuario();
    }

    @PutMapping("/{id}")
    public Prontuario atualizarProntuario(@PathVariable Integer id, @RequestBody Prontuario prontuario){
        return prontuarioService.atualizarProntuario(id, prontuario);
    }

    @DeleteMapping("/{id}")
    public void deletarProntuario(@PathVariable Integer id){
        prontuarioService.deletarProntuario(id);
    }
}
