package it.pizzeria.model;

import java.util.List;

public class Pizza {

	private String nome;
	private String tipo;
	private double prezzo;
	private List<String> ingredienti;
	
	public Pizza(String nome, String tipo, double prezzo, List<String> ingredienti) {
		
		this.nome = nome;
		this.tipo = tipo;
		this.prezzo = prezzo;
		this.ingredienti = ingredienti;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public List<String> getIngredienti() {
		return ingredienti;
	}

	public void setIngredienti(List<String> ingredienti) {
		this.ingredienti = ingredienti;
	}
	
	@Override
	public String toString() {
		return nome + " [" + tipo + "] - Ingredienti: " + ingredienti + " - Prezzo: " + prezzo + "€";
	}
	
}
