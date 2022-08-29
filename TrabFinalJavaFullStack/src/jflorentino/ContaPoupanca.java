package jflorentino;

public class ContaPoupanca extends Conta {
	private int diaAniversario;
	private String titularPoupanca;
	private String tipo = "Conta Poupanca";
	
	// Metodos Construtores da classe 

	public ContaPoupanca(int numero, String dataAbert, boolean status,
			String senha, float saldo, int diaAniversario, Pessoa titularPoupanca ) {
		super(numero, dataAbert, status, senha, saldo, titularPoupanca);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the diaAniversario
	 */
	public int getDiaAniversario() {
		return diaAniversario;
	}

	/**
	 * @param diaAniversario the diaAniversario to set
	 */
	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}

	/**
	 * @return the titularPoupanca
	 */
	public String getTitularPoupanca() {
		return titularPoupanca;
	}
	
	public String gettipo() {
		return tipo;
	}
	

	/**
	 * @param titularPoupanca the titularPoupanca to set
	 */
	public void setTitularPoupanca(String titularPoupanca) {
		this.titularPoupanca = titularPoupanca;
	}
	
	
	

}
