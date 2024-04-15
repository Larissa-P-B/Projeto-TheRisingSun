package br.com.fiap.therisingsun.model;


import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

@Data
@Entity

public class Cadastro {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "{cadastro.nome.notblank}")
    @Size(min = 3, max = 255)
    private String nome;
    
    @CPF
    private int CPF;

    @Email
    private String email;

    @NotEmpty
    @Size(min = 8,max = 16)
    private String senha;

    private LocalDate data;

    
    
}
