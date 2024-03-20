package br.com.fiap.therisingsun.controller;

import static org.springframework.http.HttpStatus.CREATED;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.com.fiap.therisingsun.model.Cadastro;
import br.com.fiap.therisingsun.repository.CadastroRepository;
import jakarta.validation.Valid;

public class CadastroController {
    
    @Autowired
    CadastroRepository repository;

    @GetMapping
    public List<Cadastro> index(){
        return repository.findAll();
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public Cadastro create(@RequestBody @Valid Cadastro cadastro){
        return repository.save(cadastro);
    }
}
