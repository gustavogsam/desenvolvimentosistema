package com.example.projeto2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @RequestMapping("/")
    public String inicio(){
        return "Bem Vindo a aula";


    }

    @RequestMapping("/meio")
    public String meio(){
        return "meio da aula";
    }

}
