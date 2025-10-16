package com.example.aula15._0.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.aula15._0.dto.UsuarioRequestDTO;
import com.example.aula15._0.dto.UsuarioResponseDTO;
import com.example.aula15._0.model.UsuarioModel;
import com.example.aula15._0.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UsuarioModel salvarUsuario(UsuarioRequestDTO usuarioRequestDTO){
        if(usuarioRepository.findByEmail(usuarioRequestDTO.getEmail()).isPresent()){
            throw new IllegalArgumentException("usuario já cadastrado");
        }

        UsuarioModel usuario = new UsuarioModel();
        usuario.setNome(usuarioRequestDTO.getNome());
        usuario.setEmail(usuarioRequestDTO.getEmail());
        usuario.setSenha(bCryptPasswordEncoder.encode(usuarioRequestDTO.getSenha()));

        usuarioRepository.save(usuario);
        return usuario;
    }

    public List<UsuarioResponseDTO> listarTodos(){
        return usuarioRepository
        //retorna com ps dados de todos os usuarios na tabela
        .findAll()
        //Envia os dados ob
        .stream()

        .map(u -> new UsuarioResponseDTO(u.getId(), u.getNome(), u.getEmail()))

        .toList();

}

}
