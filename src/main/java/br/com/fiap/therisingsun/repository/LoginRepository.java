package br.com.fiap.therisingsun.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.therisingsun.model.Login;

public interface LoginRepository extends JpaRepository<Login, String>{
    
}
