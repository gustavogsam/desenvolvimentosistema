package com.example.projeto6.controller;

import com.example.projeto6.model.Funcionario;
import com.example.projeto6.services.Funcionarioservice;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

    private Funcionarioservice funcionarioservice;

    public FuncionarioController(Funcionarioservice funcionarioservice) {
        this.funcionarioservice = funcionarioservice;
    }

    @GetMapping
    public List<Funcionario> listarfuncionarios(){
        return funcionarioservice.listartodos();
    }

    @PostMapping
    public ResponseEntity<Funcionario>salvarfuncionario(@RequestBody Funcionario funcionario){
        funcionarioservice.salvar(funcionario);
        return ResponseEntity.status(HttpStatus.CREATED).body(funcionario);

    }
}
