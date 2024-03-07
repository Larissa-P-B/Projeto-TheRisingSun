package br.com.fiap.therisingsun.TheRisingSun.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.therisingsun.TheRisingSun.model.Categoria;
import br.com.fiap.therisingsun.TheRisingSun.model.Produto;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("categoria")
public class ProdutoController {
    
    Logger log = LoggerFactory.getLogger(getClass());

    List<Categoria> repository = new ArrayList<>();

    List<Produto> repositoryProd = new ArrayList<>();

    

    @GetMapping
    public List<Categoria> index(){
        return repository;
    }

    @PostMapping("/produto")
    public ResponseEntity<Produto> create(@RequestBody Produto produto) {
        log.info("Cadastrando categoria {}", produto);
        repositoryProd.add(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(produto);

    }    

    
    
    
}
