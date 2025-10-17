package com.example.aula161025.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bem")
public class Welcome {
    @GetMapping
   public String mensagem(){
        return"bem-vindo!";
    }

}
