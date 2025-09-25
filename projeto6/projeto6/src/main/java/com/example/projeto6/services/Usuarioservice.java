package com.example.projeto6.services;

import com.example.projeto6.model.Funcionario;
import com.example.projeto6.model.Usuario;
import com.example.projeto6.repository.Usuariorepository;

import java.util.List;

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
        //verifica funcionario ja cadastrado
        if (usuariorepository.findByemail(usuario.getEmail()).isPresent()){
            //se encontrar um telefone ja cadastrado mostra a mensagem abaixo
            throw new RuntimeException("Funcionario Cadastrado");
        }
        // se não encontrar o funcionario na verificação cadastrar funcionario
        return usuariorepository.save(usuario);
    }

}
