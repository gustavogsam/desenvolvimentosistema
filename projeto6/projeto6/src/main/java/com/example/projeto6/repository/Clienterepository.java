package com.example.projeto6.repository;

import com.example.projeto6.model.Cliente;
import com.example.projeto6.model.Usuario;

import java.util.Optional;

public interface Clienterepository {
    Optional<Cliente> findByprotocoloatendimento(String protocoloatendimento);
}
