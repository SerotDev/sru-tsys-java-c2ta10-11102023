package PT3;

import PT2.CustomException;

public class Pt3MainApp {

	public static void main(String[] args) {
		aleatorioParOImpar();
	}
	
	public static void aleatorioParOImpar() {
		System.out.println("Generando numero aleatorio...");
		Random aleatorio = new Random();
		
		System.out.println("El numero generado es " +  aleatorio.getNumero() + ".");
		
		try {
			if (aleatorio.getNumero() %2== 0) {
				throw new CustomException(2);
			} else {
				throw new CustomException(3);
			}
		} catch (CustomException e) {
			System.out.println(e.getMessage());
		}
	}

}
