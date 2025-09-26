package com.example.projeto7.controller;

import com.example.projeto7.model.Aluno;
import com.example.projeto7.service.Alunoservice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

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

    @PostMapping
    public ResponseEntity<Aluno>salvar(@RequestBody Aluno aluno){
        alunoservice.salvar(aluno);
     return ResponseEntity.status(HttpStatus.CREATED).body(aluno);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Aluno>atualizar(@PathVariable UUID id, @RequestBody Aluno aluno){
        alunoservice.atualizar(id,aluno);
        return ResponseEntity.status(HttpStatus.OK).body(aluno);


    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable UUID id){
        alunoservice.exluir(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
