package br.com.fiap.therisingsun.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import br.com.fiap.therisingsun.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

    

    
}