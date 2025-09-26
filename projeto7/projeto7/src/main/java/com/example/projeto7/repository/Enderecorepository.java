package com.example.projeto7.repository;

import com.example.projeto7.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Enderecorepository extends JpaRepository<Endereco,Long> {

}
