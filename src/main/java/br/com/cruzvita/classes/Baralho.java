package br.com.cruzvita.classes;

import java.util.ArrayList;
import java.util.Collections;

public class Baralho {

	private ArrayList<Carta> baralho;

	public Baralho() {
		baralho = new ArrayList<Carta>();

		String[] naipes = { "ouro", "copas", "paus", "espadas" };
		String[] valorCarta = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "K", "Q", "J" };

		for (String naipe : naipes) {
			for (String cartas : valorCarta) {
				baralho.add(new Carta(naipe, cartas));
			}
		}
		
		/* Adicionamos 4 coringas */
		for (int i = 0; i < 4; i++) {
			baralho.add(new Carta("Coringa", "Coringa"));
		}
	}

	public void embaralha() {
		Collections.shuffle(baralho);
	}

	public boolean temCarta() {
		return !baralho.isEmpty();
	}

	public Carta darCarta() {
		if (temCarta()) {
			return baralho.remove(baralho.size() - 1);
		} else {
			return null;
		}
	}

	public void imprimeBaralho(Carta carta) {
		System.out.println(carta.getNaipe() + " de " + carta.getNome());
	}
}
