package com.example.projeto7.controller;

import com.example.projeto7.model.Aluno;
import com.example.projeto7.service.Alunoservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class Alunocontroller {
    private Alunoservice alunoservice;

    public Alunocontroller(Alunoservice alunoservice) {
        this.alunoservice = alunoservice;
    }

    @GetMapping
    List<Aluno>listartodos(){
        return alunoservice.listar();
    }
}
