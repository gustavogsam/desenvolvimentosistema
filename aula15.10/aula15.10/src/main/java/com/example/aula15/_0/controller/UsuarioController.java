package com.example.aula15._0.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aula15._0.dto.UsuarioRequestDTO;
import com.example.aula15._0.dto.UsuarioResponseDTO;
import com.example.aula15._0.model.UsuarioModel;
import com.example.aula15._0.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Map<String,Object>> salvarUsuario(@RequestBody UsuarioRequestDTO dto){
        UsuarioModel usuario = usuarioService.salvarUsuario(dto);
        return ResponseEntity
        .created(null)
        .body(Map.of(
            "mensagem", "Usuário cadastrado com sucesso",
            "sucesso", true));
    }
    
    @GetMapping
    public ResponseEntity<List<UsuarioResponseDTO>>listar(){
        return ResponseEntity
        .ok(usuarioService.listarTodos());
    }
    
}
