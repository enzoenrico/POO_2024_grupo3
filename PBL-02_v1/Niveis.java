package pbl02;

import java.util.Random;

public class Niveis {

	String melhorJogador;
	int kills;
	int moedas;
	
	public Niveis() {
        pontosDoNivel();
    }
	
	public void pontosDoNivel() {
		Random rand = new Random();
		
		this.kills = rand.nextInt(101);
		this.moedas = rand.nextInt(101);

	}

	public int getKills() {
		return kills;
	}

	public void setKills(int kills) {
		this.kills = kills;
	}

	public int getMoedas() {
		return moedas;
	}

	public void setMoedas(int moedas) {
		this.moedas = moedas;
	}

	public String getMelhorJogador() {
		return melhorJogador;
	}

	public void setMelhorJogador(String melhorJogador) {
		this.melhorJogador = melhorJogador;
	}
	
}
