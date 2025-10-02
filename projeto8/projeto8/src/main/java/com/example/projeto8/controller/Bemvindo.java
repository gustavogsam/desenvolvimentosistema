package com.example.projeto8.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bemvindo")

public class Bemvindo {
    @GetMapping("/")

    public String mensagem() {
    return "Seja bem-vindo!";
}
}
