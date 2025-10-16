package com.example.aula15._0.exception;

import java.util.Map;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalException {
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String,Object>> IllegalArgumentException(IllegalArgumentException erro){
        return ResponseEntity
            .badRequest()
            .body(Map.of(
                "mensagem", erro.getMessage(),
                "sucesso", false));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String,Object>> methodArgumentNotValidException(MethodArgumentNotValidException erro){
        return ResponseEntity
        .badRequest()
        .body(Map.of(
            "mensagem", erro.getFieldError().get(0).getDefaultMessage(),"sucesso", false));
    }
}