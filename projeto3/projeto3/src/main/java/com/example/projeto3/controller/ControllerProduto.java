package com.example.projeto3.controller;

import com.example.projeto3.model.Produto;
import com.example.projeto3.repository.ProdutoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ControllerProduto {

    private ProdutoRepository produtoRepository;

    @GetMapping
    public List<Produto> ListarTodos(){
        return produtoRepository.findAll();
    }

    public ControllerProduto(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public ResponseEntity<Produto> salvar(@RequestBody Produto produto){
        produtoRepository.save(produto);
        return ResponseEntity.status(HttpStatus.OK).body(produto);
    }
    @DeleteMapping
    public ResponseEntity<Produto> delete(@RequestBody Produto produto) {
        produtoRepository.delete(produto);
        return (ResponseEntity.status(HttpStatus.OK).body(produto)) ;

    }


}
