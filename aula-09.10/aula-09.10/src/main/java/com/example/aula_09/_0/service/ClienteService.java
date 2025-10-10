package com.example.aula_09._0.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.aula_09._0.model.Cliente;
import com.example.aula_09._0.repository.ClienteRepository;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }

    public Cliente salvar(Cliente cliente) {
        if(clienteRepository.findByEmail(cliente.getEmail()).isPresent()){
            throw new IllegalArgumentException("Email ja cadastrado");
        }
        return clienteRepository.save(cliente);
    }

    public Cliente atualizar(Cliente cliente) {
        if(!clienteRepository.findByEmail(cliente.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Cliente nao encontrado");
        }
        return clienteRepository.save(cliente);
    }

    public void deletar(Long id) {
        if(!clienteRepository.existsById(id)) {
            throw new RuntimeException("Cliente nao encontrado");
        }
        clienteRepository.deleteById(id);
    }

}
