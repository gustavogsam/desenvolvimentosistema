package com.example.projeto5.repository;

import com.example.projeto5.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface Clienterepository extends JpaRepository<Cliente, UUID> {
}
