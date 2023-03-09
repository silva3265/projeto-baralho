package br.com.cruzvita.principal;

import br.com.cruzvita.classes.Baralho;
import br.com.cruzvita.classes.Carta;

public class Principal {
	public static void main(String[] args) {

		Baralho jogo = new Baralho(); 

		jogo.embaralha(); /* Primeior embaralhar a carta*/

		while (jogo.temCarta()) { /* enquanto estiver carta, dar a carta e imprimir o baralho */
			Carta carta = jogo.darCarta();
			jogo.imprimeBaralho(carta);
		}

	}
}
