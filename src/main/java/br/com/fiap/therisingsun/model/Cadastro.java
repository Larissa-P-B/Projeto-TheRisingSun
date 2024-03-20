package br.com.fiap.therisingsun.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
@Data
@Entity
public class Cadastro {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "{cadastro.descricao.notblank}")
    @Size(min = 3, max = 255)
    private String descricao;

    @Positive
    private BigDecimal valor;

    private LocalDate data;

    @CadastroUsuario
    private String tipo; //ENTRADA | SAIDA
    
}
