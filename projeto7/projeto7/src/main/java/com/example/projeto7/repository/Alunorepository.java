package com.example.projeto7.repository;

import com.example.projeto7.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;
@Repository
public interface Alunorepository extends JpaRepository<Aluno, UUID> {

    Optional<Aluno> findByemail(String email);
}
