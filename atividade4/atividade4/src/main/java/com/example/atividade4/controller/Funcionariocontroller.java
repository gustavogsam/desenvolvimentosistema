package com.example.atividade4.controller;

import com.example.atividade4.model.Funcionario;
import com.example.atividade4.repository.Funcionariorepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class Funcionariocontroller {

    @Autowired
    private Funcionariorepository funcionariorepository;


    public Funcionariocontroller(Funcionariorepository funcionariorepository) {
        this.funcionariorepository = funcionariorepository;
    }

    @GetMapping
    public List<Funcionario>Listartodos(){
        return funcionariorepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Funcionario> salvar(@RequestBody Funcionario funcionario){
        funcionariorepository.save(funcionario);
        return ResponseEntity.status( HttpStatus.OK ).body(funcionario);
    }
    @DeleteMapping
    public ResponseEntity<Funcionario> deletar(@RequestBody Funcionario funcionario){
        funcionariorepository.delete(funcionario);
        return ResponseEntity.status( HttpStatus.OK ).body(funcionario);
    }

}
