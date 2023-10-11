package PT5;

import java.util.Iterator;

public class Password {
	private final int LONG_DEFAULT = 8;
	private int longitud;
	private String contrasena;
	
	public Password() {
		this.longitud = LONG_DEFAULT;
		this.contrasena = generarPassword(longitud);
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.contrasena = generarPassword(longitud);
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasena() {
		return contrasena;
	}
	
	public static String generarPassword(int longitud){
		String generated_pass = "";
		try {
			for (int i = 0; i < longitud; i++) {
				char character = (char) (int) (Math.random()*(122-(48-1))+48);
				generated_pass += character;
			}
		} catch (Exception e) {
			System.out.println("Error al generar la contraseña, por defecto está vacía.");
		}
		return generated_pass;
	}
	
	public boolean esFuerte() {
		boolean is_fuerte = false;
		int mayusculas = 0;
		int minusculas = 0;
		int numeros = 0;
		try {
			for (int i = 0; i < this.contrasena.length(); i++) {
				//si es mayuscula
				if (this.contrasena.charAt(i) >= 'A' && this.contrasena.charAt(i) <= 'Z' ) {
					mayusculas++;
				//si es minuscula
				}else if (this.contrasena.charAt(i) >= 'a' && this.contrasena.charAt(i) <= 'z' ) {
					minusculas++;
				}
				//si es numero
				else if (this.contrasena.charAt(i) >= '0' && this.contrasena.charAt(i) <= '9' ) {
					numeros++;
				}
			}
			
			//validamos que la contraseña sea fuerte
			if (mayusculas > 2 && minusculas > 1 && numeros > 5) {
				is_fuerte = true;
			}
			
		} catch (Exception e) {
			System.out.println("Ha fallado la validación de la contraseña.");
		}
		
		return is_fuerte;
		
	}
	
}