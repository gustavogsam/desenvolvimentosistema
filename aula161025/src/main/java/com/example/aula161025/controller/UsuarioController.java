package com.example.aula161025.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.aula161025.dto.UsuarioRequestDTO;
import com.example.aula161025.dto.UsuarioResponseDTO;
import com.example.aula161025.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Map<String,Object>> salvar(@RequestBody UsuarioRequestDTO dto){
        usuarioService.salvar(dto);
        return ResponseEntity
        .created(null)
        .body(Map.of("mensagem","Usuário cadastrado com sucesso","sucesso",true));
    }

    @GetMapping
    public ResponseEntity<List<UsuarioResponseDTO>> listar(){
        return ResponseEntity
        .ok()
        .body(usuarioService.listar());
    }

    @PutMapping
    public ResponseEntity<Map<String,Object>> atualizar(@PathVariable Long id,@RequestBody UsuarioRequestDTO dto){
        usuarioService.atualizarUsuario(id, dto);
        return ResponseEntity
        .ok()
        .body(Map.of("mensagem","Usuário atualizado com sucesso","sucesso",true));
    }

    public ResponseEntity<Map<String,Object>> deletar(@PathVariable Long id){
        usuarioService.deletarUsuario(id);
        return ResponseEntity
        .ok()
        .body(Map.of("mensagem","Usuário deletado com sucesso","sucesso",true));
    }
}
