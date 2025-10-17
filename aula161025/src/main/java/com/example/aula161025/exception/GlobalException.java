package com.example.aula161025.exception;

import java.util.Map;

import javax.management.RuntimeErrorException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String,Object>> handleValidationExceptions(IllegalArgumentException erro){
        return ResponseEntity
        .badRequest()
        .body(Map.of("mensagem", erro.getMessage(), "sucesso", false));
    }

    
    @ExceptionHandler(RuntimeErrorException.class)
    public ResponseEntity<Map<String,Object>> handleValidationExceptions(RuntimeErrorException erro){
        return ResponseEntity
        .badRequest()
        .body(Map.of("mensagem", erro.getMessage(), "sucesso", false));
    }

    
@ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String,Object>> handleValidationExceptions(MethodArgumentNotValidException erro){
        return ResponseEntity
        .badRequest()
        .body(Map.of("mensagem", erro.getMessage(), "sucesso", false));
    }
}