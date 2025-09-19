package com.example.atividade4.repository;

import com.example.atividade4.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Funcionariorepository extends JpaRepository<Funcionario, Long> {
}
