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

import com.example.aula_09._0.model.Cliente;
import com.example.aula_09._0.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public List<Cliente> listarClientes() {
        return clienteService.listar();
    }

    @PostMapping
    public ResponseEntity<Map<String, String>> cadastrarCliente(@RequestBody Cliente cliente) {
        Cliente clienteCadastrado = clienteService.salvar(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of(
            "mensagem", "Cliente cadastrado com sucesso!"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, String>> atualizarCliente(@PathVariable Long id, @RequestBody Cliente cliente) {
        Cliente clienteAtualizado = clienteService.atualizar(cliente);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of(
            "mensagem", "Cliente atualizado com sucesso!"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, String>> deletarCliente(@PathVariable Long id) {
        clienteService.deletar(id);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of(
            "mensagem", "Cliente deletado com sucesso!"));
    }

}
