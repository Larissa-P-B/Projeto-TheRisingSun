package br.com.fiap.therisingsun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@Controller
@EnableCaching
@OpenAPIDefinition(
	info = @Info(
		title = "The Rising Sun",
		version = "1.0",
		contact = @Contact(name = "Larissa P Biusse", email = "rm551062@fiap.com.br"),
		license = @License(name = "MIT", url = "https://opensource.org/license/mit"),
		summary = "API do app The Rising Sun - papelaria online"
	)
)
public class TheRisingSunApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheRisingSunApplication.class, args);
	}

	
	@RequestMapping
	@ResponseBody 
	public String home(){
		return "The Rising Sun  - Papelaria Online";
	}


}
