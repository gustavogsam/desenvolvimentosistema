package com.example.aula_09._0.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aula_09._0.model.Funcionario;
import com.example.aula_09._0.service.FuncionarioService;

@RestController
@RequestMapping("/funcionarios")
public class FuncionanarioController {

    @Autowired
    private FuncionarioService funcionarioService;
    public FuncionanarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @GetMapping
    public List<Funcionario> listarFuncionarios() {
        return funcionarioService.listar();
    }

    @PostMapping
    public ResponseEntity<Map<String, String>> cadastrarFuncionario(@RequestBody Funcionario funcionario) {
        Funcionario funcionarioCadastrado = funcionarioService.salvar(funcionario);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of(
            "mensagem", "Funcionário cadastrado com sucesso!"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, String>> atualizarFuncionario(@PathVariable Long id, @RequestBody Funcionario funcionario) {
            Funcionario funcionarioAtualizado = funcionarioService.atualizar(funcionario);
            return ResponseEntity.status(HttpStatus.OK).body(Map.of(
                "mensagem", "Funcionário atualizado com sucesso!"));
        }
        
     @DeleteMapping("/{id}")
        public ResponseEntity<Map<String, String>> deletarFuncionario(@PathVariable Long id) {
            funcionarioService.deletar(id);
            return ResponseEntity.status(HttpStatus.OK).body(Map.of(
                "mensagem", "Funcionário deletado com sucesso!"));
        }   
    
}
