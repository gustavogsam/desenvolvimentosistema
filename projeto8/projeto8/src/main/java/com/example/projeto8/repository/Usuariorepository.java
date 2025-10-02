package com.example.projeto8.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projeto8.model.Usuariomodel;




@Repository
public interface Usuariorepository extends JpaRepository<Usuariomodel, UUID> {
    Optional<Usuariomodel> findByEmail(String email);

}
