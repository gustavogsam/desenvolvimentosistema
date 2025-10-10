package com.example.aula_09._0.exception;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, Object>> IllegalArgumentException(IllegalArgumentException erro) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of(
            "mensagem", erro.getMessage()));
    }
    
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Map<String, Object>> RuntimeException(RuntimeException erro) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(Map.of(
            "mensagem", erro.getMessage()));
    }
 
}
