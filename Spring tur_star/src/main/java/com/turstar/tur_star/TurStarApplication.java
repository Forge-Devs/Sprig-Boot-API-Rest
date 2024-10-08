package com.turstar.tur_star;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TurStarApplication {
@RestController
@RequestMapping("/pontos-turisticos")

	public static void main(String[] args) {
		SpringApplication.run(TurStarApplication.class, args);
	}

}
