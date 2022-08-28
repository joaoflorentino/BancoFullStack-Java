package jflorentino;

public class ContaEspecial extends Conta {
	private float limite;
	private String titular;
	private String tipo = "cce";
	
	//Construtor conta especial 
	public ContaEspecial() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ContaEspecial(int numero, String dataAbert, boolean status, String senha,
			float saldo, float limite, String titular) {
		super(numero, dataAbert, status, senha, saldo);
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the limite
	 */
	public float getLimite() {
		return limite;
	}
	/**
	 * @param limite the limite to set
	 */
	public void setLimite(float limite) {
		this.limite = limite;
	}
	/**
	 * @return the titular
	 */
	public String getTitular() {
		return titular;
	}
	/**
	 * @param titular the titular to set
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public String gettipo() {
		return tipo;
	}
	
	
	
	
	
}
