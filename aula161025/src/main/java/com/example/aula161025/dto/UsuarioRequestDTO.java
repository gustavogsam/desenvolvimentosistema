package com.example.aula161025.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioRequestDTO {
    @NotBlank(message = "O nome É obrigatório")
    @Size(min = 3, message = "O nome deve ter no minimo 3 caracteres")
    private String nome;

    @NotBlank(message = "O email É obrigatório")
    @Email(message = "O email deve ser válido")
    private String email;

    @NotBlank(message = "A senha É obrigatória")
    @Size(min = 6,max=20, message = "A senha deve ter entre 6 e 20 caracteres")
    private String senha;

}
