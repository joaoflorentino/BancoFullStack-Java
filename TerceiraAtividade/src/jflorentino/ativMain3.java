package jflorentino;

public class ativMain3 {

	public static void main(String[] args) {
		/** Main da Atividade 03 */
		Aluno aluno1 = new Aluno("c003","Paulo Vargas",5f,5.5f,3.75f);
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
		aluno1.confereMedia(fat);
		//Novo aluno com construtor padrão
		Aluno aluno2 = new Aluno();
		float d = aluno2.getNota01();
		float e = aluno2.getNota02();
		float f = aluno2.getNotaTrabalho();
		
		System.out.println(aluno2.toString());
		System.out.println();
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		float fat2 = aluno2.getMedia(d, e, f);
		System.out.println("A Média do aluno é = " + fat2);
		aluno2.confereMedia(fat2);
		
		// Construtor 2 com apenas codigo e nome de aluno
		Aluno aluno3 = new Aluno("00014", "Laercio Prata");
		float d2 = aluno3.getNota01();
		float e2 = aluno3.getNota02();
		float f2 = aluno3.getNotaTrabalho();
		
		System.out.println(aluno3.toString());
		System.out.println();
		System.out.println(d2);
		System.out.println(e2);
		System.out.println(f2);
		float fat3 = aluno3.getMedia(d2, e2, f2);
		System.out.println("A Média do aluno é = " + fat3);
		aluno2.confereMedia(fat3);
	}

}
