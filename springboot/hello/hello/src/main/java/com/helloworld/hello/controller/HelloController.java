package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

public class HelloController {
	
	@GetMapping
	public String hello() {
		return "As habilidades e mentalidades utilizadas para o desenvolvimento "
				+ "dessa atividade foram persistência e atenção aos detalhes!!";
	}

}
