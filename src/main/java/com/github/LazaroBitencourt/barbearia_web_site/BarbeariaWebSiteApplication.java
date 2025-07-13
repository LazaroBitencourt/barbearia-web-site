package com.github.LazaroBitencourt.barbearia_web_site;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class BarbeariaWebSiteApplication {

	@GetMapping
	public String javaHome(){return "<h1> Java Home, <br> Bem vindos a sua API de agendamendo para barbearia</h1>";}

	public static void main(String[] args) {
		SpringApplication.run(BarbeariaWebSiteApplication.class, args);
	}
}
