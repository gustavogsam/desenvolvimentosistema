package com.example.aula._8._0.repository;

import com.example.aula._8._0.model.Funcionariomodel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface FuncionarioreRepository extends JpaRepository<Funcionariomodel,Long> {
       Optional<Funcionariomodel> findByEmail(String email);
}
