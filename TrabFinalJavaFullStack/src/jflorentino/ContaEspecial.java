package jflorentino;

public class ContaEspecial extends Conta {
	private float limite;
	private String titular;
	private String tipo = "Conta Especial";
	
	//Construtor conta especial 
	public ContaEspecial() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ContaEspecial(int numero, String dataAbert, boolean status, String senha,
			float saldo, float limite, Pessoa titular) {
		super(numero, dataAbert, status, senha, saldo, titular);
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
	
	
	public String gettipo() {
		return tipo;
	}
	
	
	
	
	
}
