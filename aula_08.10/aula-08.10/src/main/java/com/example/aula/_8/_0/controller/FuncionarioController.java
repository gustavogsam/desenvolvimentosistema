package com.example.aula._8._0.controller;

import com.example.aula._8._0.model.Funcionariomodel;
import com.example.aula._8._0.service.FuncionarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

private FuncionarioService funcionarioService;

    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @GetMapping
    List<Funcionariomodel>Lista(){
        return funcionarioService.listar();
    }

    @PostMapping
public ResponseEntity<Map<String,Object>>salvar(@RequestBody Funcionariomodel funcionariomodel){
        funcionarioService.salvar(funcionariomodel);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("mensagem","Cadastrado com Sucesso."));
    }

    public ResponseEntity<Map<String,Object>> atualizar(@PathVariable Long id,@RequestBody Funcionariomodel funcionario){
        funcionarioService.atualizar(id, funcionario);

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem","atualizado com Sucesso."));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String,Object>>excluir(@PathVariable Long id){
        funcionarioService.excluir(id);

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem","Usuário excluido com sucesso"));
    }
}
