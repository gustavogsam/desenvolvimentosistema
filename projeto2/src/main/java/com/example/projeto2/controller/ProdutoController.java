package com.example.projeto2.controller;


import com.example.projeto2.model.Produto;
import com.example.projeto2.repository.ProdutoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    @GetMapping
    public List<Produto> ListarTodos(){
        return produtoRepository.findAll();
    }

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public ResponseEntity<Produto>salvar(@RequestBody Produto produto){
        produtoRepository.save(produto);
        return ResponseEntity.status(HttpStatus.OK).body(produto);
    }



}
