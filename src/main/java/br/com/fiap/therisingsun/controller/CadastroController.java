package br.com.fiap.therisingsun.controller;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.HttpStatus.NO_CONTENT;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.com.fiap.therisingsun.model.Cadastro;
import br.com.fiap.therisingsun.repository.CadastroRepository;
import jakarta.validation.Valid;
@RestController
@RequestMapping("cadastro")
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

    @GetMapping("{id}")
    public ResponseEntity<Cadastro> show(@PathVariable Long id) {
       

        return repository
            .findById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());

    }

    @PutMapping("{id}")
    public Cadastro update(@PathVariable Long id, @RequestBody Cadastro cadastro) {
        verificarSeCadastroExiste(id);
        cadastro.setId(id);
        return repository.save(cadastro);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(NO_CONTENT)
    public void destroy(@PathVariable Long id) {
        verificarSeCadastroExiste(id);
        repository.deleteById(id);
    }

    private void verificarSeCadastroExiste(Long id) {
        repository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        NOT_FOUND,
                        "Não existe categoria com o id informado"));
    }



    
    

}
