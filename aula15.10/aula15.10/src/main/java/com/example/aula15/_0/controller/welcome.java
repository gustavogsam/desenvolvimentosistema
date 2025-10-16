package com.example.aula15._0.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class welcome {

    @GetMapping
    public String welcome(){
        return "Bem vindo!";
    }
}
