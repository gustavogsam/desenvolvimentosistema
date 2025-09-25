package com.example.projeto6.controller;

import com.example.projeto6.model.Usuario;
import com.example.projeto6.services.Usuarioservice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

   private Usuarioservice usuarioservice;

    public UsuarioController(Usuarioservice usuarioservice) {
        this.usuarioservice = usuarioservice;
    }

    @GetMapping
    public List<Usuario> listarfuncionarios(){
        return usuarioservice.listartodos();
    }

    @PostMapping
    public ResponseEntity<Usuario> salvarfuncionario(@RequestBody Usuario usuario){
        usuarioservice.salvar(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuario);

    }

}
