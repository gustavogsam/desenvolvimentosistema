package com.example.projeto6.repository;

import com.example.projeto6.model.Cliente;
import com.example.projeto6.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Clienterepository extends JpaRepository<Cliente,Long> {
    Optional<Cliente> findByprotocoloatendimento(String protocoloatendimento);
}
