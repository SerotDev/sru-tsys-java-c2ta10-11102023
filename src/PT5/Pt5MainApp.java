package PT5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pt5MainApp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		//pedimos longitud de contraseña
		String str_longitud_pass;
		do {
			System.out.println("Introduce cantidad la de caracteres para generar la contraseña");
			str_longitud_pass = keyboard.nextLine();
		} while (!isNumNatural(str_longitud_pass));
		
		//generamos contraseña por defecto
		Password pass_1 = new Password();
		System.out.println("Contraseña por defecto => longitud:" + pass_1.getLongitud() + "  contraseña:" + pass_1.getContrasena());
				
		//generamos contraseña por longitud
		int longitud_pass = Integer.parseInt(str_longitud_pass);
		Password pass_2 = new Password(longitud_pass);
		System.out.println("Contraseña por parametro de longitud => longitud:" + pass_2.getLongitud() + "  contraseña:" + pass_2.getContrasena());
		
		//mostramos si la contraseña 1 es fuerte
		if (pass_1.esFuerte()) {
			System.out.println("La contraseña por defecto es fuerte.");
		} else {
			System.out.println("La contraseña por defecto no es fuerte.");
		}
		
		//mostramos si la contraseña 2 es fuerte
		if (pass_2.esFuerte()) {
			System.out.println("La contraseña por parametro de longitud es fuerte.");
		} else {
			System.out.println("La contraseña por parametro de longitud no es fuerte.");
		}
	}
	
	// metodo para validar si string un int
	public static boolean isNumNatural(String numero) {
		boolean es_int = false;
		try {
			int pass = Integer.parseInt(numero);
			es_int = true;
		} 
		catch (InputMismatchException e) {
			System.out.println("Exeption: No se ha introducido un numero entero.");
		}
		return es_int;
	}

}
