package com.example.projeto6.services;

import com.example.projeto6.model.Funcionario;
import com.example.projeto6.repository.FuncionarioRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Funcionarioservice {

    private FuncionarioRepository funcionarioRepository;

    public Funcionarioservice(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }
    //get
    public List<Funcionario> listartodos(){
        return funcionarioRepository.findAll();
    }
    //post

    public Funcionario salvar(Funcionario funcionario){
        //verifica funcionario ja cadastrado
        if (funcionarioRepository.findBycpf(funcionario.getCpf()).isPresent()){
            //se encontrar um telefone ja cadastrado mostra a mensagem abaixo
            throw new RuntimeException("Funcionario Cadastrado");
        }
        // se não encontrar o funcionario na verificação cadastrar funcionario
        return funcionarioRepository.save(funcionario);
    }

}
