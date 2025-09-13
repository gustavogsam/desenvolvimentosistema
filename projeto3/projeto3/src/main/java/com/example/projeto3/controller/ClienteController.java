package com.example.projeto3.controller;

import com.example.projeto3.model.Cliente;
import com.example.projeto3.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteRepository clienteRepository;


    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @GetMapping
    public List<Cliente> Listartodos(){
        return clienteRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Cliente>salvar(@RequestBody Cliente cliente){
        clienteRepository.save(cliente);
        return ResponseEntity.status(HttpStatus.OK).body(cliente);
    }

    @DeleteMapping
    public ResponseEntity<Cliente>deletar(@RequestBody Cliente cliente) {
        clienteRepository.delete(cliente);
        return ResponseEntity.status(HttpStatus.OK).body(cliente);


    }

    }
