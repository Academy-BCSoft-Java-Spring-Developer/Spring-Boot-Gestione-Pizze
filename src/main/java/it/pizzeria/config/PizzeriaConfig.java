package it.pizzeria.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import it.pizzeria.model.Ordinazione;
import it.pizzeria.model.Pizza;

@Configuration
public class PizzeriaConfig {

	@Bean
	public Pizza pizzaRossa() {
		return new Pizza("Margherita", "Rossa", 6.50, List.of("Pomodoro", "Mozzarella", "Basilico"));
	}
	
	@Bean
	public Pizza pizzaBianca() {
		return new Pizza("Quattro Formaggi", "Bianca", 8.00, List.of("Mozzarella", "Gorgonzola", "Fontina", "Grana"));
		
	}
	
	@Bean
	public Ordinazione ordinazione(
			@Qualifier("pizzaRossa") Pizza pRossa,
			@Qualifier("pizzaBianca") Pizza pBianca) {
		
		Ordinazione ordine = new Ordinazione(101);
		ordine.aggiungiPizza(pRossa);
		ordine.aggiungiPizza(pBianca);
		return ordine;
		
	}
	
}
