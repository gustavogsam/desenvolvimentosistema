package com.example.projeto8.services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;
import com.example.projeto8.model.Usuariomodel;
import com.example.projeto8.repository.Usuariorepository;


@Service
public class Usuarioservices {

    private  Usuariorepository usuariorepository;

    public Usuarioservices(Usuariorepository usuariorepository) {
        this.usuariorepository = usuariorepository;
    }

    
    List<Usuariomodel> listarUsuarios() {
        return usuariorepository.findAll();
    }
    
    public Usuariomodel salvarUsuario(Usuariomodel usuario) {
        if (usuariorepository.findByEmail(usuario.getEmail()).isPresent()) {
            throw new RuntimeException("email já cadastrado");
        }
        return usuariorepository.save(usuario);
    }

    public void deletarUsuario(UUID id) {
        if(!usuariorepository.existsById(id)) {
            throw new RuntimeException("Usuário não encontrado");
        }
        usuariorepository.deleteById(id);
    }

    public Usuariomodel atualizarUsuario(UUID id, Usuariomodel usuario) {
        if(!usuariorepository.existsById(id)) {
            throw new RuntimeException("Usuário não encontrado");
        }
        return usuariorepository.save(usuario);
    }

}
