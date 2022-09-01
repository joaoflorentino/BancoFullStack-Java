package jflorentino;


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
	//Metodo to string Movimentos
	@Override
	public String toString() {
		return  operacao + "       " + valor ;
		//return "Movimentos [operacao=" + operacao + ", valor=" + valor + "]";
	}


}
