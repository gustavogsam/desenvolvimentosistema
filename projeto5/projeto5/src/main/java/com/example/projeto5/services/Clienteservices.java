package com.example.projeto5.services;

import com.example.projeto5.cotroller.Clientecontroller;
import com.example.projeto5.model.Cliente;
import com.example.projeto5.repository.Clienterepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class Clienteservices {

    @Autowired
    private Clienterepository clienterepository;



    public List<Cliente> listartodos(){
        return clienterepository.findAll();
    }

    public Cliente salvar(Cliente cliente){
        return clienterepository.save(cliente);
    }

    public Cliente atualizar(UUID id, Cliente cliente){
        if(clienterepository.existsById(id)){
            return clienterepository.save(cliente);
        }
        else {
            throw new RuntimeException("Usuario não encontrado");
        }
    }

    public void deletar(UUID id){
        clienterepository.deleteById(id);
    }
}
