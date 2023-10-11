package PT1;

public class Numero {
	private final int RANGO_MIN = 1;
	private final int RANGO_MAX = 500;
	private int numero;

	public Numero() {
		this.numero = (int)(Math.random()*(RANGO_MAX - (RANGO_MIN-1)))+RANGO_MIN;
	}
	
	

	public int getRANGO_MIN() {
		return RANGO_MIN;
	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public int getRANGO_MAX() {
		return RANGO_MAX;
	}

	//compara si el numero introducido es igual al del objeto
	public boolean encontrarNumero(int num_introducido) {
		boolean numeroEncontrado = false;
		if (Integer.compare(num_introducido, this.numero) < 0) {
			System.out.println("El numero a encontrar es mas grande.");
		} else if(Integer.compare(num_introducido, this.numero) > 0) {
			System.out.println("El numero a encontrar es mas pequeño.");
		} else {
			System.out.println("Has encontrado el numero!");
			numeroEncontrado = true;
		}
		return numeroEncontrado;
	}

	@Override
	public String toString() {
		return "Numero [numero=" + numero + "]";
	}
	
	
	
	
}
