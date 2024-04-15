package br.com.fiap.therisingsun.model;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
public class Login {
    
    @Email
    private String email;

    @NotEmpty
    @Size(min = 8,max = 16)
    private String senha;
}
