package br.com.fiap.therisingsun.controller;


import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.HttpStatus.NO_CONTENT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.com.fiap.therisingsun.model.Login;
import br.com.fiap.therisingsun.repository.LoginRepository;
@RestController
@RequestMapping("login")
public class LoginController {
    
    


    @Autowired
    LoginRepository repository;

    @GetMapping("{email}")
    public ResponseEntity<Login> show(@PathVariable String email, String senha) {
        

        return repository
            .findById(senha)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());

    }


    @DeleteMapping("{email}")
    @ResponseStatus(NO_CONTENT)
    public void destroy(@PathVariable String email) {
        
        verificarSeLoginExiste(email);
        repository.deleteById(email);
    }

    private void verificarSeLoginExiste(String email) {
        repository
                .findById(email)
                .orElseThrow(() -> new ResponseStatusException(
                        NOT_FOUND,
                        "Não existe login com o email informado"));
    }





    
}
