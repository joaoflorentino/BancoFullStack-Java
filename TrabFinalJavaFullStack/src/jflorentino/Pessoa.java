package jflorentino;

public class Pessoa {
	protected static String nome;
		
	
	public Pessoa(String nome) {
		this.nome = nome;
		
	}

	
	public static String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
