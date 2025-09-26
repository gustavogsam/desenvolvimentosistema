package com.example.projeto7.repository;

import com.example.projeto7.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Clienterepository extends JpaRepository<Cliente,Long> {

    Optional<Cliente> findByemail(String email);
}
