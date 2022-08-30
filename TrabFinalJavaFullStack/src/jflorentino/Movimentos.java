package jflorentino;

import java.util.LinkedList;


public class Movimentos {
	/** Cria uma lista de operacoes na conta do cliente */
	private int conta;
	private String operacao;
	private float valor;
	
	public Movimentos() {
		/**Construtor Padrao vazio */
	}
	
	public Movimentos(int conta, String operacao, float valor) {
		/** Construtor da classe e movimentacao */
		super();
		this.conta = conta;
		this.operacao = operacao;
		this.valor = valor;
	}
		
	private LinkedList<Movimentos> mov = new LinkedList<Movimentos>();
	
	
	public void add(Movimentos mov) {
		this.mov.add(mov);
		
	}
	public void resgata() {
		for(Movimentos m : mov) {
			System.out.println(m.toString());
		}
	}
	

}
