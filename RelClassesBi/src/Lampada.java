
public class Lampada {
	private boolean status; //false = apagada; true = acesa
	private int potencia;
	private Semaforo semaforo = null;
	
	public Lampada(boolean status, int potencia) {	
		this.status = status;
		this.potencia = potencia;
	}
	
	public void acende() {
		this.status = true;
		this.disparaAlarmeSemaforo();
	}
	
	public void apaga() {
		this.status = false;
	}

	@Override
	public String toString() {
		return "Lampada [status=" + status + ", potencia=" + potencia + "]";
	}
	
	public void setSemaforo(Semaforo semaforo) {
		this.semaforo = semaforo;
	}
	
	public void disparaAlarmeSemaforo() {
		// se ocorreu problema na lampada fecha o semaforo
		this.semaforo.mensagemErro();
		System.out.println("ocorreu um erro em uma lampada");
	}
	
}
