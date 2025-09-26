package com.example.projeto7.service;

import com.example.projeto7.model.Aluno;
import com.example.projeto7.repository.Alunorepository;
import com.example.projeto7.repository.Clienterepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class Alunoservice {

    private Alunorepository alunorepository;

    public Alunoservice(Alunorepository alunorepository) {
        this.alunorepository = alunorepository;
    }

    public List<Aluno> listar(){
        return alunorepository.findAll();
    }

    public Aluno salvar(Aluno aluno){
        if(alunorepository.findByemail(aluno.getEmail()).isPresent()){
            throw new RuntimeException("Aluno ja cadastrado");
        }else {
            return alunorepository.save(aluno);
        }

    }

    public Aluno atualizar(UUID id, Aluno aluno){
        if(!alunorepository.existsById(id)){
            throw new RuntimeException("aluno não entrado");
        }
        aluno.setId(id);
        return alunorepository.save(aluno);

    }

    public void exluir(UUID id){
        if(!alunorepository.existsById(id)){
            throw new RuntimeException("aluno não encontrado");
        }

        alunorepository.deleteById(id);
    }
}
