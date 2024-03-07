package br.com.fiap.therisingsun.TheRisingSun.model;

import java.util.Random;

public record Categoria(Long id,String nome) {
    public Categoria(Long id,String nome){
        this.id = (id == null)? Math.abs(new Random().nextLong()) : id;
        this.nome = nome;

    }
}
