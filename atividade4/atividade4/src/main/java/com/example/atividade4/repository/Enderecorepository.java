package com.example.atividade4.repository;

import com.example.atividade4.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Enderecorepository extends JpaRepository<Endereco, Long> {
}
