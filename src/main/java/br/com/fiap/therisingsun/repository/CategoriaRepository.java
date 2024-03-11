package br.com.fiap.therisingsun.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.therisingsun.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
