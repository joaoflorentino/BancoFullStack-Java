
public class Principal {
	public static void main(String args[]) {
		Semaforo s1 = new Semaforo();
		System.out.println(s1.toString());		
		s1.alerta();
		System.out.println(s1.toString());
		s1.abre();
		System.out.println(s1.toString());
		
		
		Semaforo s2 = new Semaforo(2);
		System.out.println(s2.toString());		

		
	}

}
