package PT3;

public class Random {
	private final int RANGO_MIN = 0;
	private final int RANGO_MAX = 999;
	private int numero;
	
	public Random() {
		this.numero = (int)(Math.random()*(RANGO_MAX - (RANGO_MIN-1)))+RANGO_MIN;
	}

	public int getNumero() {
		return numero;
	}

}
