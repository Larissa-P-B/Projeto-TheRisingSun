package br.com.fiap.therisingsun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
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
