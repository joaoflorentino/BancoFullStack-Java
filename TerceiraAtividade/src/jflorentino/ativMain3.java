package jflorentino;

public class ativMain3 {

	public static void main(String[] args) {
		/** Main da Atividade 03 */
		TerceiraAtividade aluno1 = new TerceiraAtividade("c003","Paulo Vargas",3.85f,2.2f,8f);
		float a = aluno1.getNota01();
		float b = aluno1.getNota02();
		float c = aluno1.getNotaTrabalho();
		System.out.println(aluno1.toString());
		System.out.println();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		float fat = aluno1.getMedia(a, b, c);
		System.out.println("A Média do aluno é = " + fat);
		float recup = aluno1.confereMedia(fat);
		//System.out.println("A Nota necessária para recuperação  do aluno é = " + recup);
		

	}

}
