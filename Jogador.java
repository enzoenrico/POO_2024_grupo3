package pbl02;

public class Jogador {

	String nome;
	int moedas = 0;
	int pontos = 0;
	int kills = 0;
	int total = 0;
	
	public void resultadoDoNivel() {
		System.out.println("KILLS: " + this.getKills() + " MOEDAS: " + this.getMoedas());
		System.out.println("TOTAL DE PONTOS DO NÍVEL: " + this.getPontos());
	}
	
	
	public String getNome() {
		return nome;
	}
	public int getTotal() {
		return total;
	}


	public void setTotal(int total, int pontos) {
		this.total = total + pontos;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMoedas() {
		return moedas;
	}
	public void setMoedas(int moedas) {
		this.moedas = moedas;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int moedas, int kills) {
		this.pontos = moedas + kills;
	}
	public int getKills() {
		return kills;
	}
	public void setKills(int kills) {
		this.kills = kills;
	}
	
	
}
