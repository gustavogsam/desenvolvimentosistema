package com.example.projeto7.controller;

import com.example.projeto7.model.Cliente;
import com.example.projeto7.service.Clienteservice;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    public Clienteservice clienteservice;

    public ClienteController(Clienteservice clienteservice) {
        this.clienteservice = clienteservice;
    }
    @GetMapping
    List<Cliente> listar(){
        return clienteservice.listartodos();
    }

    @PostMapping
    public ResponseEntity<Cliente>salvar(@RequestBody Cliente cliente){
        clienteservice.salvar(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(cliente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizarCliente(
        @PathVariable Long id,
        @RequestBody Cliente cliente){

        clienteservice.atualizar(id,cliente);
        return ResponseEntity.status(HttpStatus.OK).body(cliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void>excluir(@PathVariable Long id){
        clienteservice.excluir(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }


}
