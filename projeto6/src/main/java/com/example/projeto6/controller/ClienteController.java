package com.example.projeto6.controller;

import com.example.projeto6.model.Cliente;
import com.example.projeto6.services.Clienteservice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    
    private Clienteservice clienteservice;

    public ClienteController(Clienteservice clienteservice) {
        this.clienteservice = clienteservice;
    }

    @GetMapping
    public List<Cliente> listarcliente(){
        return clienteservice.listartodos();
    }

    @PostMapping
    public ResponseEntity<Cliente> salvarfcliente(@RequestBody Cliente cliente){
        clienteservice.salvar(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(cliente);

    }
    
}
