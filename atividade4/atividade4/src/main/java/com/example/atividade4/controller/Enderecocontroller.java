package com.example.atividade4.controller;

import com.example.atividade4.model.Endereco;
import com.example.atividade4.repository.Enderecorepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/endereco")
public class Enderecocontroller {

    @Autowired
    public Enderecorepository enderecorepository;

    public Enderecocontroller(Enderecorepository enderecorepository) {
        this.enderecorepository = enderecorepository;
    }
    @GetMapping
    public List<Endereco> Listartodos(){
    return enderecorepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Endereco> salvar(@RequestBody Endereco endereco){
        enderecorepository.save(endereco);
        return ResponseEntity.status( HttpStatus.OK ).body(endereco);
    }


}
