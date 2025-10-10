package com.example.aula_09._0.model;

public enum UnidadeFederativa {
    Bahia,
    SaoPaulo,
    RioDeJaneiro;

    private String sigla(){
        if(this == Bahia) return "BA";
        if(this == SaoPaulo) return "SP";
        return "RJ";
    }
}
