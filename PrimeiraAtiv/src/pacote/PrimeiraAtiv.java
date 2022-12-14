package pacote;


import java.util.Arrays;


public class PrimeiraAtiv {
	
	static int lisT[] = new int[6]; //Cria lista de valores 
	static int matrz[][] = new int[6][6]; //Cria matriz de valores calculados
	static int mt[][];
	static float m;
	static int maiores;
	
	public static void main(String[] args) {
		// Inicio
		PrimeiraAtiv(5,6,7,8,9,10); // lista de valores para calculo - cria lista
		System.out.println("Esta é a lista de valores: ");
		System.out.println(Arrays.toString(lisT));
		mt = ConstroeMtz(lisT); // Chama a criação da Matriz 
		m = mediaMtz(mt);
		maiores = ComparaEsoma(mt,m);
	}
	public static void PrimeiraAtiv(int i, int j, int k, int l, int m, int n) {
		/**Construtor da lista de dados */
		lisT[0] = i;
		lisT[1] = j;
		lisT[2] = k;
		lisT[3] = l;
		lisT[4] = m;
		lisT[5] = n;
		
	}
	
	public static int[][] ConstroeMtz(int lista[]) {
		/**Construtor da matriz */
		for(int i=0; i < 6;i++) {
			for(int j=0; j < 6;j++) {
				matrz[i][j]= lista[i] * lista[j];	
			}
		}
		System.out.println("Matriz composta pela lista dada:"); //Imprime o texto 
		for (int lin = 0; lin < 6; lin++) {   // comandos para imprimir a matriz
			for (int col = 0; col < 6; col++) {
				System.out.print(matrz[lin][col]+" ");// imprime prime linhas 
			}
			System.out.println(" "); // separa as linhas 
			
		}
		return matrz;

	}
	
	public static float mediaMtz(int mat[][]) {
		/**Calcula a media da soma de cada elemento da matriz */ 
		float med = 0;
		for(int i=0; i < 6; i++) {
			for(int j=0; j < 6; j++) {
				med = med + mat[i][j];
			}
		}
		float media = med/36;
		System.out.println("Valor medio da soma dos elementos da matriz = " + media);
		return media;

	}
	
	public static int ComparaEsoma(int mat[][], float media) {
		/** Compara e soma os valores da matriz com a média dos valores */
		int somaMaiores = 0;
		for(int k = 0; k < 6; k++) {
			for(int l = 0; l < 6; l++) {
				if (mat[k][l] > media){
					somaMaiores = mat[k][l]+ somaMaiores;
					
				}
			}
		}
		System.out.println("A soma dos maiores que a Média = " + media + " é igual a >> " + somaMaiores );
		return somaMaiores;
	}

} // FIM da classe

