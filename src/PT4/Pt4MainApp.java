package PT4;

import javax.swing.JOptionPane;

public class Pt4MainApp {

	public static void main(String[] args) {
		pideOperacion();
	}
	
	public static void pideOperacion(){
		String nombre_operacion = JOptionPane.showInputDialog("Introduce tipo de operación a realizar: "
				+ "\nsuma, resta, multiplicación, potencia, raíz cuadrada, raíz cúbica o división");
		while (!Operaciones.calcular(nombre_operacion)) {
			nombre_operacion = JOptionPane.showInputDialog("Introduce tipo de operación a realizar: "
					+ "\nsuma, resta, multiplicación, potencia, raíz cuadrada, raíz cúbica o división");
		}

	}

}
