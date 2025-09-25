package com.example.projeto6.repository;

import com.example.projeto6.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
     Optional<Funcionario> findBycpf(String cpf);
}
