package jflorentino;

public class TerceiraAtividade {
	/** Classe que cria um aluno no projeto*/
	private String matricula;
	private String nome;
	private float nota01;
	private float nota02;
	private float notaTrabalho;
	
	// Entrada de Getrs e Setrs 
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getNota01() {
		return nota01;
	}
	public void setNota01(float nota01) {
		this.nota01 = nota01;
	}
	public float getNota02() {
		return nota02;
	}
	public void setNota02(float nota02) {
		this.nota02 = nota02;
	}
	public float getNotaTrabalho() {
		return notaTrabalho;
	}
	public void setNotaTrabalho(float notaTrabalho) {
		this.notaTrabalho = notaTrabalho;
	}
	
	// Entrada de Construtores 
	
	public TerceiraAtividade() {
		/** Construtor padrao sem passagem de valores*/
		super();
		this.matricula = "0000000";
		this.nome = "Nome não definido";
		this.nota01 = 0;
		this.nota02 = 0;
		this.notaTrabalho = 0;
		
	}
	public TerceiraAtividade(String matricula, String nome) {
		/** Segundo construtor com valor matricula e nome */
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.nota01 = 0;
		this.nota02 = 0;
		this.notaTrabalho = 0;
		
	}
	public TerceiraAtividade(String matricula, String nome, float nota01, float nota02, float notaTrabalho) {
		/** Construtor com todos os parametros passados */
		this.matricula = matricula;
		this.nome = nome;
		this.nota01 = nota01;
		this.nota02 = nota02;
		this.notaTrabalho = notaTrabalho;
		//System.out.println(getMedia(nota01, nota02, notaTrabalho));
		
	}
	
	// Entrada dos Metodos 
	public  float getMedia(float nota01, float nota02, float notaTrabalho) {
		/** Calcula a media das notas com respectivos pesos */
		float pesoProvas = 2.5f;
		float pesoTrabalho = 5.0f;
		float mediaNotas = ((pesoProvas * (nota01 + nota02) 
				+ (pesoTrabalho * notaTrabalho))/(2*pesoProvas + pesoTrabalho ));
		return mediaNotas;
			
	}
	public  float confereMedia(float notamedia) {
		/**Confere se a media é maior que valor de aprovação*/
		float aprovacao = 5.0f;
		if (notamedia <= aprovacao) {
			return getNotaRec(notamedia);	
		}
		
	System.out.println("Aluno(a) aprovado(a) com nota = " + notamedia);
	float notaRecuperacao = 0f;	
	return notamedia;	
		
	}
	public static float getNotaRec(float nota) {
		/** Calcula nota necessaria para aprovacao */
		float notaRec = 10 - nota;
		System.out.println("Nota necessaria para aprovação na Recuperação => " + notaRec);
		return notaRec;

	}
	@Override
	public String toString() {
		return "TerceiraAtividade [matricula=" + matricula + ", nome=" + nome + ", nota01=" + nota01 + ", nota02="
				+ nota02 + ", notaTrabalho=" + notaTrabalho + "]";
	}
	
	
	
	
		
} // Fim Classe TerceiraAtividade
