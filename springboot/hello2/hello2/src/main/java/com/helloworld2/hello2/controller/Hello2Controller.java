package com.helloworld2.hello2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello2")

public class Hello2Controller {
	
	@GetMapping
	public String hello2() {
		return "Para está semana planejo estudar e entender melhor sobre o SQL, e agora sobre "
				+ "Spring Boot, que inicialmente eu pensei que era complicado, mas agora está "
				+ "bem intuitivo.\n"
				+ "Com esses conhecimentos adquiridos pretendo me reunir com meu grupo para planejar "
				+ "quais implementações vamos fazer no projeto integrador.";
	}
	
}
