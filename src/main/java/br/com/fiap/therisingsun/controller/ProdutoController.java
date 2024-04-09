package br.com.fiap.therisingsun.controller;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.HttpStatus.NO_CONTENT;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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


import br.com.fiap.therisingsun.model.Produto;

import br.com.fiap.therisingsun.repository.ProdutoRepository;


@RestController
@RequestMapping("produto")
public class ProdutoController {
    Logger log = LoggerFactory.getLogger(getClass());

    @Autowired // Injeção de Dependência - Inversão de Controle
    ProdutoRepository repository;

    @GetMapping
    public List<Produto> index() {
        return repository.findAll();
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public Produto create(@RequestBody Produto prod) {
        log.info("Cadastrando categoria {}", prod);
        return repository.save(prod);
    }

    @GetMapping("{id}")
    public ResponseEntity<Produto> show(@PathVariable Long id) {
        log.info("buscando produto com id {}", id);

        return repository
            .findById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());

    }


    @DeleteMapping("{id}")
    @ResponseStatus(NO_CONTENT)
    public void destroy(@PathVariable Long id) {
        log.info("apagando produto {}", id);
        verificarSeProdutoExiste(id);
        repository.deleteById(id);
    }

    @PutMapping("{id}")
    public Produto update(@PathVariable Long id, @RequestBody Produto produto) {
        log.info("atualizar produto {} para {}", id, produto);

        verificarSeProdutoExiste(id);
        produto.setId(id);
        return repository.save(produto);
    }

    private void verificarSeProdutoExiste(Long id) {
        repository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        NOT_FOUND,
                        "Não existe categoria com o id informado"));
    }

}
