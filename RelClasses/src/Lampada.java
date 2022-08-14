
public class Lampada {
	private boolean status; //false = apagada; true = acesa
	private int potencia;
	
	public Lampada(boolean status, int potencia) {	
		this.status = status;
		this.potencia = potencia;
	}
	
	public void acende() {
		this.status = true;
	}
	
	public void apaga() {
		this.status = false;
	}

	@Override
	public String toString() {
		return "Lampada [status=" + status + ", potencia=" + potencia + "]";
	}
	
}
