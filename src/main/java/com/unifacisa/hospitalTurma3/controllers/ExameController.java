package com.unifacisa.hospitalTurma3.controllers;

import com.unifacisa.hospitalTurma3.entities.Consulta;
import com.unifacisa.hospitalTurma3.entities.Exame;
import com.unifacisa.hospitalTurma3.services.ConsultaService;
import com.unifacisa.hospitalTurma3.services.ExameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exames")
public class ExameController {

    @Autowired
    private ExameService exameService;

    @PostMapping
    public Exame cadastrarExame(@RequestBody Exame exame){
        return exameService.cadastrarExame(exame);
    }

    @GetMapping
    public List<Exame> listarExames(){
        return exameService.listarExames();
    }

    @PutMapping("/{id}")
    public Exame atualizarExame(@PathVariable Integer id, @RequestBody Exame exame){
        return exameService.atualizarExame(id, exame);
    }

    @DeleteMapping("/{id}")
    public void deletarExame(@PathVariable Integer id){
        exameService.deletarExame(id);
    }
}
