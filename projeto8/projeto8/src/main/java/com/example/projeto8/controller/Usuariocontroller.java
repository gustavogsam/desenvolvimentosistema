package com.example.projeto8.controller;

import java.util.List;
import java.util.UUID;

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

import com.example.projeto8.model.Usuariomodel;
import com.example.projeto8.services.Usuarioservices;

@RestController
@RequestMapping("/usuario")
public class Usuariocontroller {

    private Usuarioservices usuarioservices;

    @Autowired
    public Usuariocontroller(Usuarioservices usuarioservices) {
        this.usuarioservices = usuarioservices;
    }

    @GetMapping
    List<Usuariomodel> listar() {
        return usuarioservices.listarUsuarios();
    }
    @PostMapping
    public ResponseEntity<Usuariomodel> salvar(@RequestBody Usuariomodel usuario) {
        Usuariomodel novoUsuario = usuarioservices.salvarUsuario(usuario);
        return new ResponseEntity.Status(HttpStatus.CREATED).body(usuario);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuariomodel> atualizar(@RequestBody Usuariomodel usuario) {
        usuarioservices.atualizarUsuario(id, usuario);
        return ResponseEntity.Status(HttpStatus.OK).body(usuario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable UUID id) {
        usuarioservices.deletarUsuario(id);
        return ResponseEntity.noContent().build();
    }

    

}
