package PT1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pt1MainApp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Numero aleatorio = new Numero();
		
		introduceNum(keyboard, aleatorio);
		
	}
	
	// usuario introduce numero
	public static void introduceNum(Scanner keyboard, Numero aleatorio) {
		System.out.println("Intenta adivinar el numero generado aleatoriamente entre " + aleatorio.getRANGO_MIN() + " y " + aleatorio.getRANGO_MAX());
		String str_num_usuario = keyboard.nextLine();
		while (!isNumNatural(str_num_usuario)) {
			System.out.println("Intenta adivinar el numero generado aleatoriamente entre " + aleatorio.getRANGO_MIN() + " y " + aleatorio.getRANGO_MAX());
			str_num_usuario = keyboard.nextLine();
		}
		int num_usuario = Integer.parseInt(str_num_usuario);
		
		//si no se encuentra el numero aleatorio
		while (!aleatorio.encontrarNumero(num_usuario)) {
			str_num_usuario = keyboard.nextLine();
			while (!isNumNatural(str_num_usuario)) {
				System.out.println("Introduce el nuevo numero:");
				str_num_usuario = keyboard.nextLine();
			}
			num_usuario = Integer.parseInt(str_num_usuario);
		}
		
	}
	
	// metodo para validar si string un int
	public static boolean isNumNatural(String numero) {
		boolean es_int = false;
		try {
			int num_usuario = Integer.parseInt(numero);
			es_int = true;
		} 
		catch (InputMismatchException e) {
			System.out.println("Exeption: No se ha introducido un numero entero.");
		}
		return es_int;
	}

}
