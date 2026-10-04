package com.unifacisa.hospitalTurma3.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "exames")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Exame {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idExame;

    private String nome;
    private String tipo;

    @ManyToMany(mappedBy = "exames")
    private List<Consulta> consultas = new ArrayList<>();
}
