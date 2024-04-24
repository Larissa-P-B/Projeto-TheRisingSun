package br.com.fiap.therisingsun.config;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.fiap.therisingsun.model.Categoria;
import br.com.fiap.therisingsun.repository.CategoriaRepository;
@Configuration
public class DatabaseSeeder implements CommandLineRunner {

    @Autowired
    CategoriaRepository categoriaRepository;
    @Override
    public void run(String... args) throws Exception {
        categoriaRepository.saveAll(
            List.of(
               Categoria.builder().id(1L).nome("papelaria").build(),
               Categoria.builder().id(2L).nome("escritorio").build(),
               Categoria.builder().id(3L).nome("informatica").build()



            )
        );

    } 
    
}
