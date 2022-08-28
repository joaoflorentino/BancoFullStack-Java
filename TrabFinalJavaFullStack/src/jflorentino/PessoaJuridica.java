package jflorentino;

public class PessoaJuridica {
	
	private String cnpj;
	private String nome;
	private String cidade;
	private String estado;
	
	// Metodos Contrutores
	public PessoaJuridica(String cnpj, String nome, String cidade, String estado) {
		/** COnstrutor com todos os parametros */
		super();
		this.cnpj = cnpj;
		this.nome = nome;
		this.cidade = cidade;
		this.estado = estado;
	}

	public PessoaJuridica() {
		/** Construtor padrão */
		super();
	}

	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * @param cnpj the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the cidade
	 */
	public String getCidade() {
		return cidade;
	}

	/**
	 * @param cidade the cidade to set
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
	
	

}
