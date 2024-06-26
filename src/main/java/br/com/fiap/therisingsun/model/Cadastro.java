package br.com.fiap.therisingsun.model;



import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import jakarta.validation.constraints.Size;


import lombok.Data;


import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.annotation.CreatedDate;


@Data
@Entity


public class Cadastro {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String nome;
    
    @CPF
    private String CPF;

    @Email
    private String email;

   
    @Size(min = 8,max = 16)
    private String senha;

    @CreatedDate
    private LocalDateTime data;

    
    
}
