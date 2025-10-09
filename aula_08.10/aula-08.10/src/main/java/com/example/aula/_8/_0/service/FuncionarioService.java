package com.example.aula._8._0.service;

import com.example.aula._8._0.model.Funcionariomodel;
import com.example.aula._8._0.repository.FuncionarioreRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    private FuncionarioreRepository funcionarioreRepository;

    public FuncionarioService(FuncionarioreRepository funcionarioreRepository) {
        this.funcionarioreRepository = funcionarioreRepository;
    }

     public List<Funcionariomodel>listar(){
        return funcionarioreRepository.findAll();
    }

    public Funcionariomodel salvar(Funcionariomodel funcionario){
        if(funcionarioreRepository.findByEmail(funcionario.getEmail()).isPresent()){
            throw new IllegalArgumentException("Funcionario ja cadastrado");
        }
     return funcionarioreRepository.save(funcionario);
    }

    public Funcionariomodel atualizar(Long id, Funcionariomodel funcionario){
        if(!funcionarioreRepository.existsById(id)){
            throw new IllegalArgumentException("Usuario não encontrado");
        }
        funcionario.setId(id);
        return funcionarioreRepository.save(funcionario);
    }

    public void excluir(Long id){
        if(!funcionarioreRepository.existsById(id)){
            throw new RuntimeException("Funcionario não encontrado");
        }
       funcionarioreRepository.deleteAllById(id);
    }

}
