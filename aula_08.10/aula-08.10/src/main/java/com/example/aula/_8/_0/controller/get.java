package com.example.aula._8._0.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class get {

        @GetMapping
        public String texto(){
        return "Bem-vindo!";
    }

}
