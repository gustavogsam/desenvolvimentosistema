package com.example.projeto2.controller;

import com.example.projeto2.model.Cliente;
import com.example.projeto2.repository.ClienteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityReturnValueHandler;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> ListarTodos(){
        return clienteRepository.findAll();
    }

    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @PostMapping
    public ResponseEntity<Cliente>salvar(@RequestBody Cliente cliente){
        clienteRepository.save(cliente);
        return ResponseEntity.status(HttpStatus.OK).body(cliente);
    }
}
