package br.com.fiap.therisingsun.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
public class Login {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
  
    @Email
    private String email;

   
    @NotEmpty
    @Size(min = 8,max = 16)
    private String senha;
}
