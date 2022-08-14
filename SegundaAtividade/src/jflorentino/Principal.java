package jflorentino;

public class Principal {
	
	public static void main(String[] args) {
		SegundaAtividade R1 = new SegundaAtividade(1247, 37, 50);
		System.out.println("Código do Robo R1-  "  + R1.getIdentRobo());
		System.out.println("Posição X do Robo_01 " + R1.getCoodX() + " graus");
		System.out.println("Posição Y do Robo_01 " + R1.getCoorY() + " graus");
		System.out.println("Entra nova posição Robo R1 - " + R1.getIdentRobo());
		R1.setCoodX(100);
		R1.setCoorY(25);
		System.out.println("Nova coordenada X => " + R1.getCoodX() + " graus");
		System.out.println("Nova coordenada Y => " + R1.getCoorY() + " graus");
		
	}

}
