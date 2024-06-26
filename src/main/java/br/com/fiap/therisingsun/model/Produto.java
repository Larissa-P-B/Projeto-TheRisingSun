package br.com.fiap.therisingsun.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Produto {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String tipo;
    private String imagem;
    private String descricao;
    private double preco;
    @Column(name = "quantidade_disponivel", nullable = false)
    private int quantidadeDisponivel;
    
}
