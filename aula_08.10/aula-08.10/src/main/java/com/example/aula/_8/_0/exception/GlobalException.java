package com.example.aula._8._0.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


import java.util.Map;
import java.util.Objects;



@RestControllerAdvice
public class GlobalException {
@ExceptionHandler(IllegalAccessException.class)
    public ResponseEntity<Map<String, Object>> IllegalAccessException(IllegalAccessException erro){

    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("mensagem",erro.getMessage()));
}

@ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Map<String,Object>> runtimeException(RuntimeException erro){

    return ResponseEntity.status(HttpStatus.CONFLICT).body(Map.of("mensagem",erro.getMessage()));
}
}
