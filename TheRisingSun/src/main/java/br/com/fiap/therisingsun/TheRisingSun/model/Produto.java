package br.com.fiap.therisingsun.TheRisingSun.model;

import java.util.Random;

public record Produto(Long id,String nome,String marcaProduto,float preco,String tipo,String descricao,String imgProduto ) {
    public Produto(Long id,String nome,String marcaProduto,float preco,String tipo,String descricao,String imgProduto){
        this.id = (id == null)? Math.abs(new Random().nextLong()) : id;
        this.nome = nome;
        this.tipo = tipo;
        this.marcaProduto = marcaProduto;
        this.preco = preco;
        this.descricao = descricao;
        this.imgProduto = imgProduto;

    }
}
