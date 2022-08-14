
public class Data {
	// atributos
	private int dia = 1;
	private int mes = 1;
	private int ano = 1;
	private String mesext[] = {"janeiro", "fevereiro", "março", 
			"abril", "maio", "junho", "julho", "agosto", "setembro",
			"outubro", "novembro", "dezembro"};
	
	
	// construtor
	public Data(int dia, int mes, int ano) {
		if (this.validaData(dia, mes, ano)) {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		} 
		
	}

	private boolean validaData(int dia2, int mes2, int ano2) {
		// validar a data;
		
		return false;
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}
	
	public boolean isBissexto() {
		if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))){
			return true;			
		}		
		return false;		
	}
	
	public int getAno2Dig() {
		return ano%100;
	}
	
	public String getAno2DigStr() {
		String anostr = String.valueOf(ano);
		int tamstr = anostr.length();
		anostr = anostr.substring(tamstr -2, tamstr);
		return anostr;
	}

	
	public String mesExtenso() {
		return this.mesext[this.mes - 1];
	}

	@Override
	public String toString() {
		return "Data [dia=" + dia + ", mes=" + mes + ", ano=" + ano + "]";
	}
	
	public Data clone() {
		Data dataClone = new Data(this.dia, this.mes, this.ano);
		return dataClone;		
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	
	public static void main(String args[]) {
		Data d1 = new Data(10,10,2022);
		System.out.println(d1.toString());
		System.out.println("Ano 2 digitos: " + d1.getAno2Dig());
		System.out.println("Ano 2 digitos str: " + d1.getAno2DigStr());
		System.out.println("Ano bissexto? : " + d1.isBissexto());	
		
		Data d2 = d1.clone();
		d1.setDia(10);
		System.out.println(d1.toString());
		System.out.println(d2.toString());
	}	
	
}
