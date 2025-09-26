package com.example.projeto7.service;

import com.example.projeto7.model.Cliente;
import com.example.projeto7.repository.Clienterepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Clienteservice {
    private Clienterepository clienterepository;

    public Clienteservice(Clienterepository clienterepository) {
        this.clienterepository = clienterepository;
    }
    //get
    public List<Cliente>listartodos(){
        return clienterepository.findAll();
    }
    //post
    public Cliente salvar(Cliente cliente){
        if (clienterepository.findByemail(cliente.getEmail()).isPresent()){
            //se encontrar um telefone ja cadastrado mostra a mensagem abaixo
            throw new RuntimeException("Cliente Cadastrado");
        }else {
        // se não encontrar o cliente na verificação cadastrar funcionario
        return clienterepository.save(cliente);
    }
    }

    //put-update
    public Cliente atualizar(Long id, Cliente cliente){
        if(!clienterepository.existsById(id)){
            throw new RuntimeException("Cliente não encontrado");
        }
        cliente.setId(id);
        return clienterepository.save(cliente);
    }

    //delete
    public void excluir(Long id){
        if (!clienterepository.existsById(id)){
            throw  new RuntimeException("Cliente não encontrado.");
        }
        clienterepository.deleteById(id);

    }
}