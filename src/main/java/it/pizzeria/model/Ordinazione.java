package it.pizzeria.model;

import java.util.ArrayList;
import java.util.List;

public class Ordinazione {
	
    private int idOrdine;
    private List<Pizza> pizze;

    public Ordinazione(int idOrdine) {
        this.idOrdine = idOrdine;
        this.pizze = new ArrayList<>();
    }

    // Metodo per aggiungere una singola pizza alla comanda
    public void aggiungiPizza(Pizza pizza) {
        this.pizze.add(pizza);
    }

    // Calcola il conto sommando il prezzo di ciascuna pizza
    public double calcolaTotale() {
        double totale = 0.0;
        for (Pizza p : pizze) {
            totale += p.getPrezzo();
        }
        return totale;
    }

    // Stampa a video la comanda completa
    public void stampaOrdine() {
    	
        System.out.println("         ORDINE #" + idOrdine);
        
        for (Pizza p : pizze) {
            System.out.println("- " + p);
        }
        
        System.out.println("TOTALE DA PAGARE: " + calcolaTotale() + "€");
        
    }
}