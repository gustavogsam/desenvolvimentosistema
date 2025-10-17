package com.example.aula161025.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.aula161025.dto.UsuarioResponseDTO;
import com.example.aula161025.dto.UsuarioRequestDTO;
import com.example.aula161025.model.Usuariomodel;
import com.example.aula161025.repository.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepository;


    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public Usuariomodel salvar(UsuarioRequestDTO usuarioRequestDTO){
        if(usuarioRepository.findByEmail(usuarioRequestDTO.getEmail()).isPresent()){
            throw new IllegalArgumentException("Usuario já cadastrado");
        }

        Usuariomodel novoUsuario = new Usuariomodel();
        novoUsuario.setNome(usuarioRequestDTO.getNome());
        novoUsuario.setEmail(usuarioRequestDTO.getEmail());
        novoUsuario.setSenha(bCryptPasswordEncoder.encode(usuarioRequestDTO.getSenha()));
        usuarioRepository.save(novoUsuario);
        return novoUsuario;

    }


    public List<UsuarioResponseDTO>listar(){
        return usuarioRepository
        .findAll()
        .stream()
        .map(u ->new UsuarioResponseDTO(u.getNome(), u.getEmail()))
        .toList();

    }

    public Usuariomodel atualizarUsuario(Long id,UsuarioRequestDTO dto){
       if(!usuarioRepository.existsById(id)){
        throw new RuntimeException("Usuário não encontrado");

       }

         Usuariomodel atualizarUsuariomodel = new Usuariomodel();
         atualizarUsuariomodel.setId(id);
            atualizarUsuariomodel.setNome(dto.getNome());
            atualizarUsuariomodel.setEmail(dto.getEmail());
            atualizarUsuariomodel.setSenha(bCryptPasswordEncoder.encode(dto.getSenha()));
      
        usuarioRepository.save(atualizarUsuariomodel);
        return atualizarUsuariomodel;

    }

        public void deletarUsuario(Long id){
            if(!usuarioRepository.existsById(id)){
                throw new RuntimeException("Usuário não encontrado");
        
               }
               usuarioRepository.deleteById(id);
        }
}
