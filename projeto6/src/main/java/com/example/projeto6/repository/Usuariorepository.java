package com.example.projeto6.repository;

import com.example.projeto6.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface Usuariorepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByemail(String email);
}
