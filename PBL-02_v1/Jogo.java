package pbl02;

import java.util.*;

public class Jogo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Jogador jogador1 = new Jogador();
		Jogador jogador2 = new Jogador();
			
		for (int i = 1; i <= 2; i++) {
			System.out.println("Digite seu nome jogador " + i + ": ");
			if(i == 1) {
				jogador1.setNome(scan.next());				
			}else {
				jogador2.setNome(scan.next());
			}
		}
		
		System.out.println("Vamo começar! Nível 1 ...");
		
		for (int j = 1; j <= 4; j++) {
			Niveis nivel = new Niveis();
			for (int k = 1; k <= 2; k++) {
				if (k == 1) {
					nivel.pontosDoNivel();
		            jogador1.setKills(nivel.getKills());
					jogador1.setMoedas(nivel.getMoedas());	
					jogador1.setPontos(jogador1.getMoedas(), jogador1.getKills());
					jogador1.setTotal(jogador1.getTotal(), jogador1.getPontos());

				}else {
					nivel.pontosDoNivel();
					jogador2.setKills(nivel.getKills());	
					jogador2.setMoedas(nivel.getMoedas());
					jogador2.setPontos(jogador2.getMoedas(), jogador2.getKills());
					jogador2.setTotal(jogador2.getTotal(), jogador2.getPontos());

				}
			}
			
			if(jogador1.getPontos() > jogador2.getPontos()) {
				nivel.setMelhorJogador(jogador1.getNome());
				System.out.println(nivel.getMelhorJogador() + " foi o melhor jogador do nível " + j);
				jogador1.resultadoDoNivel();
			}else {
				nivel.setMelhorJogador(jogador2.getNome());
				System.out.println(nivel.getMelhorJogador() + " foi o melhor jogador do nível " + j);
				jogador2.resultadoDoNivel();
			}
		}
		if(jogador1.getTotal() > jogador2.getTotal()) {
			System.out.println("O VENCEDOR É O JOGADOR: " + jogador1.getNome() + " TOTAL DE PONTOS: " + jogador1.getTotal());
		}else {
			System.out.println("O VENCEDOR É O JOGADOR: " + jogador2.getNome() + " TOTAL DE PONTOS: " + jogador2.getTotal());

		}
		System.out.println("FIM");
		
	}

}
