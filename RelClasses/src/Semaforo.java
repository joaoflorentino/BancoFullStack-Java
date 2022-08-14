
public class Semaforo {
	// atributos
	private Lampada lverm;
	private Lampada lamar;
	private Lampada lverd;
	private int status; // 0 = fechado, 1 = alerta, 2 = aberto
	
	public Semaforo() {
		// inicializa o semaforo com status fechado
		this.inicializaLampadas();
		this.fecha();		
	}

	public Semaforo(int status) {	
		// inicializa o semaforo com status fechado
		this.inicializaLampadas();
		if (status == 0) {
			this.fecha();
		} else if (status == 1) {
			this.alerta();
		} else {
			this.abre();
		}
	}
	
	private void inicializaLampadas() {
		// inicializa o semaforo com status fechado
		this.lverm = new Lampada(false, 30);
		this.lamar = new Lampada(false, 50);
		this.lverd = new Lampada(false, 40);		
	}
	
	public void fecha() {
		lverm.acende();
		lamar.apaga();
		lverd.apaga();
		this.status = 0;
	}
	
	public void alerta() {
		lverm.apaga();
		lamar.acende();
		lverd.apaga();
		this.status = 1;
	}	
	
	public void abre() {
		lverm.apaga();
		lamar.apaga();
		lverd.acende();
		this.status = 2;
	}

	@Override
	public String toString() {
		return "Semaforo [lverm=" + lverm + ", lamar=" + lamar + ", lverd=" + lverd + " status=" + status + "]";
	}
	
}

