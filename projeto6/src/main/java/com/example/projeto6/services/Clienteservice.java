package com.example.projeto6.services;

import com.example.projeto6.model.Cliente;
import com.example.projeto6.repository.Clienterepository;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Clienteservice {

    private Clienterepository clienterepository;

    public Clienteservice(Clienterepository clienterepository) {
        this.clienterepository = clienterepository;
    }

    //get
    public List<Cliente> listartodos(){return clienterepository.findAll();}
    //post

    public Cliente salvar(Cliente cliente){
        //verifica funcionario ja cadastrado
        if (clienterepository.findByprotocoloatendimento(cliente.getProtocoloatendimento()).isPresent()){
            //se encontrar um telefone ja cadastrado mostra a mensagem abaixo
            throw new RuntimeException("Funcionario Cadastrado");
        }
        // se não encontrar o funcionario na verificação cadastrar funcionario
        return clienterepository.save(cliente);
    }

}
