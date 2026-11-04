package it.pizzeria;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import it.pizzeria.model.Ordinazione;

@SpringBootApplication
public class GestionePizzeApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionePizzeApplication.class, args);
	}

	@Bean
	public CommandLineRunner eseguiOrdine(Ordinazione ordinazione) {
		return args -> { ordinazione.stampaOrdine();};
	}
}
