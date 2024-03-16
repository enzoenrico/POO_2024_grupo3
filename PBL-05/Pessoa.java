package pbl05;

public class Pessoa {
	
	int id;
	String nome;
	String tipo;
	
	public Pessoa(String nome, String tipo, int id) {
		this.setNome(nome);
		this.setTipo(tipo);
		this.setId(id);
	}
	
	
	
// GETTERS E SETTERS 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
}
