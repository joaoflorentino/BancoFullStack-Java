package jflorentino;
import javax.swing.plaf.synth.SynthOptionPaneUI;

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
		/** validar a data para continuar processamento */
		if(((dia2 >= 1) && (dia2 <= 31)) && ((mes2 >= 1) && (mes2 < 13)) && (ano2 > 0)) {
			return true;
		}
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
		/** Qualifica o ano como bissexto ou não */
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
	
	public int compare(int dia, int mes, int ano) {
		/**Compara a data existente no Objeto e avalia se e maior ou menor*/
		if((this.dia == dia) && (this.mes == mes) && (this.ano == ano)) {
			return 0;
		}else if((this.dia < dia)) {
			return -1;
		}
		else if (this.mes < mes) {
			return -1;
		}
		else if (this.ano < ano) {
			return -1;
		}
		return 1;
		
	}
	
	
	public static void main(String args[]) {
		Data d1 = new Data(5,12,2032);
		System.out.println(d1.toString());
		System.out.println("Ano 2 digitos: " + d1.getAno2Dig());
		System.out.println("Ano 2 digitos str: " + d1.getAno2DigStr());
		System.out.println("Ano bissexto? : " + d1.isBissexto());	
		
		Data d2 = d1.clone();
		d1.setDia(10);
		System.out.println(d1.toString());
		System.out.println(d2.toString());//Clone não alterou a data pois esta em end diferente
		System.out.println(d1.mesExtenso()); //Retorna a escrita do mes
		int resp = d1.compare(1, 4, 2040);
		if(resp == 0) {
			System.out.println("Datas Iguais ");
		}
		else if (resp == -1) {
			System.out.println("Data Maior que a do Objeto inicial !!");
		}
		else if (resp == 1) {
			System.out.println("Data menor que a do Objeto inicial !!");
		}
		
	}	
	
}
