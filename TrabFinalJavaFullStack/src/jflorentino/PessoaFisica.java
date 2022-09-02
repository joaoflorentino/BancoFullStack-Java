package jflorentino;

public class PessoaFisica extends Pessoa{
	private String cpf;
	private String nome;
	private String nascimento;
	private String rg;
	private float renda = 0f;
	
	//Metodos Construtores
	public PessoaFisica(String cpf, String nome, String nascimento, String rg, float renda) {
		/**  Construtor com todos os ites da conta */
		super(nome);
		this.cpf = cpf;
		this.nome = nome;
		this.nascimento = nascimento;
		this.rg = rg;
		this.renda = renda;
		
	}

	public PessoaFisica() {
		/** Construtor padrão */
		super(Pessoa.nome);
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the nascimento
	 */
	public String getNascimento() {
		return nascimento;
	}

	/**
	 * @param nascimento the nascimento to set
	 */
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	/**
	 * @return the rg
	 */
	public String getRg() {
		return rg;
	}

	/**
	 * @param rg the rg to set
	 */
	public void setRg(String rg) {
		this.rg = rg;
	}

	/**
	 * @return the renda
	 */
	public float getRenda() {
		return renda;
	}

	/**
	 * @param renda the renda to set
	 */
	public void setRenda(float renda) {
		this.renda = renda;
	}
	

	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", nascimento=" 
	+ nascimento + ", rg=" + rg + ", renda=" + renda + ", nome=" + nome + "]";
	}
	
	
	
	
	

	
}
