package jflorentino;

public class Conta {
	
	private int numero;
	private String dataAbert;
	private boolean status;
	private String senha;
	private float saldo;
	private String tipo = "Conta Comum";
	
	
	
	//Metodos Construtores
	public Conta(int numero, String dataAbert, boolean status, String senha, float saldo) {
		/** Constritor com todos os parametros */
		super();
		this.numero = numero;
		this.dataAbert = dataAbert;
		this.status = status;
		this.senha = senha;
		this.saldo = saldo;
	}


	public Conta() {
		/** Construtor padrao */
		super();
	}


	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}


	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}


	/**
	 * @return the dataAbert
	 */
	public String getDataAbert() {
		return dataAbert;
	}


	/**
	 * @param dataAbert the dataAbert to set
	 */
	public void setDataAbert(String dataAbert) {
		this.dataAbert = dataAbert;
	}


	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}


	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}


	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}


	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}


	/**
	 * @return the saldo
	 */
	public float getSaldo() {
		return saldo;
	}


	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public String gettipo() {
		return tipo;
	}
	
	// Metodos da classe Conta poupanca
	public void deposito(float i) {
		/** Calculo de novo saldo por deposito */
		this.saldo = this.saldo + i;
	}

	// Metodo da classe conta
	public void saque(float i) {
		/** Calculo de novo saldo por saque */
		this.saldo = this.saldo - i;
		
	}


	public void atualizaTaxa() {
		/** Calculo da taxa de conta */
		ContaEspecial c =  new ContaEspecial();
		ContaPoupanca p = new ContaPoupanca();
		String k1 = this.tipo;
		String k2 = c.gettipo();
		String k3 = p.gettipo();
		if( k1 == "Conta Comum") {
			float tx = 20f;
			saque(tx);
		} else if (k2 == "Conta Especial") {
			float tx = 30f;
			saque(tx);
		} else if (k3 == "Conta Poupanca") {
			this.saldo = this.saldo * 1.005f;
		}	
	
	}

	// Metodo de relatorio
	public void relatorio() {
		// TODO Auto-generated method stub
		System.out.println("-------------------------------");
		System.out.println("Conta: " + getNumero());
		System.out.println("Tipo: " + gettipo());
	}
	
	
	
	
	
}
