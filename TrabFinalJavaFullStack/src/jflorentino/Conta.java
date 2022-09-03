package jflorentino;

import java.util.LinkedList;
import java.util.List;

public class Conta implements ElementosDoBanco{
	
	private int numero;
	private String dataAbert;
	private boolean status;
	private String senha;
	private float saldo;
	private String tipo = "Conta Comum";
	private Pessoa titular;
	
	protected List<Movimentos> movimentos = new LinkedList<Movimentos>();
	
		
	
	//Metodos Construtores
	public Conta(int numero, String dataAbert, boolean status, String senha, float saldo, Pessoa pessoa) {
		/** Constritor com todos os parametros */
		super();
		this.numero = numero;
		this.dataAbert = dataAbert;
		this.status = status;
		this.senha = senha;
		this.saldo = saldo;
		this.titular = pessoa;
	}


	public Conta() {
		/** Construtor padrao */
		super();
	}

	
	// Getrs    &  Setrs 
	
	/**
	 * @return the titular
	 */
	public Pessoa getTitular() {
		return titular;
	}


	/**
	 * @param titular the titular to set
	 */
	public void setTitular(Pessoa titular) {
		this.titular = titular;
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
	
	
	
	
	// Metodos da classe Conta
	public void deposito(float i) {
		/** Calculo de novo saldo por deposito */
		int numero = getNumero();
		String operacao = "Deposito";
		float valorPositivo = i;
		this.saldo = this.saldo + i;
		Movimentos l = new Movimentos(numero, operacao, valorPositivo);
		this.movimentos.add(l);
	}

	public void saque(float i) {
		/** Calculo de novo saldo por saque */
		int numero = getNumero();
		String operacao = "Saque";
		float valorNegativo = i;
		this.saldo = this.saldo - i;
		Movimentos k = new Movimentos(numero, operacao, valorNegativo);
		this.movimentos.add(k);
		
	}

	public void atualizaTaxa() {
		/** Calculo da taxa de conta */
		String k = gettipo();
		float tx = 0f;
		if( k == "Conta Comum") {
			tx = 20f;
			this.saldo = this.saldo - tx;
		} else if (k == "Conta Especial") {
			tx = 30f;
			this.saldo = this.saldo - tx;
		} else if (k == "Conta Poupanca") {
			tx = this.saldo * 1.005f - this.saldo;
			this.saldo = this.saldo + tx;
		}
		int numero = getNumero();
		String operacao = "Taxa";
		float valorTaxa = tx;
		Movimentos c = new Movimentos(numero, operacao, valorTaxa);
		this.movimentos.add(c);
		
		/*
		List<Movimentos> mov = new LinkedList<>();
		mov.add(new Movimentos(numero, operacao, valorNegativo));
	*/
	}

	
	// Metodo de relatorio
	public void relatorio() {
		int i = 1;
		String m = "";
		System.out.println("-------------------------------");
		System.out.println("Conta: " + getNumero());
		System.out.println("Tipo: " + gettipo());
		System.out.println("Abertura: " + getDataAbert());
		if (isStatus()) {
			m = "Ativa";
		} else {
			m = "Inativa";
		}
		System.out.println("Status: " + m);
		System.out.println("Titular: " + getTitular());
		System.out.println("Movimentos: ");
		for(Movimentos mv : movimentos) {
			System.out.println(i + "   " + mv.toString());
			i = i+1;
		}
						
		System.out.println("Saldo: " + getSaldo());
		
	}


	@Override
	public String getElementoInfo() {
		return "Conta{" + "numero=" + numero + ", dataAbertura=" + getDataAbert() + ", "
				+ "status=" + status + ", senha=" + senha + ", saldo=" + saldo + ", titular=" + titular + '}';
		
	}
	
	
	
	
	
}
