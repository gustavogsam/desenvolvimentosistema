package com.example.aula_09._0.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.aula_09._0.model.Funcionario;
import com.example.aula_09._0.repository.FuncionarioRepository;

@Service
public class FuncionarioService {

    private FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public List<Funcionario> listar() {
        return funcionarioRepository.findAll();
    }

    public Funcionario salvar(Funcionario funcionario) {
        if(funcionarioRepository.findByEmail(funcionario.getEmail()) != null){
            throw new IllegalArgumentException("Email ja cadastrado");
        }
        return funcionarioRepository.save(funcionario);
    }
    public Funcionario atualizar(Funcionario funcionario) {
        if(!funcionarioRepository.findByEmail(funcionario.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Funcionario nao encontrado");
        }
            return funcionarioRepository.save(funcionario);
        }
    
        public void deletar(Long id) {
            if(!funcionarioRepository.existsById(id)) {
                throw new RuntimeException("Funcionario nao encontrado");
            }
            funcionarioRepository.deleteById(id);
        }
    
    }
