package com.example.aula161025.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.aula161025.model.Usuariomodel;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuariomodel, Long> {
    Optional<Usuariomodel> findByEmail(String email);
}
