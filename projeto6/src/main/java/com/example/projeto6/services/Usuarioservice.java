package com.example.projeto6.services;

import com.example.projeto6.model.Funcionario;
import com.example.projeto6.model.Usuario;
import com.example.projeto6.repository.Usuariorepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Usuarioservice {

    private Usuariorepository usuariorepository;

    public Usuarioservice(Usuariorepository usuariorepository) {
        this.usuariorepository = usuariorepository;
    }

    //get
    public List<Usuario> listartodos(){
        return usuariorepository.findAll();
    }
    //post

    public Usuario salvar(Usuario usuario){
        //verifica cliente ja cadastrado
        if (usuariorepository.findByemail(usuario.getEmail()).isPresent()){
            //se encontrar um telefone ja cadastrado mostra a mensagem abaixo
            throw new RuntimeException("Cliente Cadastrado");
        }
        // se não encontrar o cliente na verificação cadastrar funcionario
        return usuariorepository.save(usuario);
    }

}
