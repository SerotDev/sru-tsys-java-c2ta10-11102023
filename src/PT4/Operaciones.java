package PT4;

import java.util.InputMismatchException;

import javax.swing.JOptionPane;

import PT2.CustomException;

public class Operaciones {
	
	public static boolean calcular(String operador) {
		boolean is_operador = true;
		String str_num_1, str_num_2;
		int num_1, num_2;
		try {
			switch (operador.toLowerCase()) {
			case "suma":
				//introducimos 1r numero
				str_num_1 = JOptionPane.showInputDialog("Introduce el primer número a sumar");
				while (!isNumNatural(str_num_1)) {
					 str_num_1 = JOptionPane.showInputDialog("Introduce el primer número a sumar");
				}
				//introducimos 2do numero
				str_num_2 = JOptionPane.showInputDialog("Introduce el segundo número a sumar");
				while (!isNumNatural(str_num_1)) {
					 str_num_2= JOptionPane.showInputDialog("Introduce el psegundo número a sumar");
				}
				//parseamos resultados a int
				num_1 = Integer.parseInt(str_num_1);
				num_2 = Integer.parseInt(str_num_2);
				//sumamos
				suma(num_1, num_2);
				break;
			case "resta":
				//introducimos 1r numero
				str_num_1 = JOptionPane.showInputDialog("Introduce el numerador a restar");
				while (!isNumNatural(str_num_1)) {
					 str_num_1 = JOptionPane.showInputDialog("Introduce el numerador a restar");
				}
				//introducimos 2do numero
				str_num_2 = JOptionPane.showInputDialog("Introduce el denominador a restar");
				while (!isNumNatural(str_num_1)) {
					 str_num_2= JOptionPane.showInputDialog("Introduce el denominador a restar");
				}
				//parseamos resultados a int
				num_1 = Integer.parseInt(str_num_1);
				num_2 = Integer.parseInt(str_num_2);
				//restamos
				resta(num_1, num_2);
				break;
			case "multiplicacion":
			case "multiplicación":
				//introducimos 1r numero
				str_num_1 = JOptionPane.showInputDialog("Introduce el primer número a multiplicar");
				while (!isNumNatural(str_num_1)) {
					 str_num_1 = JOptionPane.showInputDialog("Introduce el primer número a multiplicar");
				}
				//introducimos 2do numero
				str_num_2 = JOptionPane.showInputDialog("Introduce el segundo número a multiplicar");
				while (!isNumNatural(str_num_1)) {
					 str_num_2= JOptionPane.showInputDialog("Introduce el segundo número a multiplicar");
				}
				//parseamos resultados a int
				num_1 = Integer.parseInt(str_num_1);
				num_2 = Integer.parseInt(str_num_2);
				//multiplicamos
				multiplicacion(num_1, num_2);
				break;
			case "potencia":
				//introducimos 1r numero
				str_num_1 = JOptionPane.showInputDialog("Introduce la base");
				while (!isNumNatural(str_num_1)) {
					 str_num_1 = JOptionPane.showInputDialog("Introduce la base");
				}
				//introducimos 2do numero
				str_num_2 = JOptionPane.showInputDialog("Introduce la potencia");
				while (!isNumNatural(str_num_1)) {
					 str_num_2= JOptionPane.showInputDialog("Introduce la potencia");
				}
				//parseamos resultados a int
				num_1 = Integer.parseInt(str_num_1);
				num_2 = Integer.parseInt(str_num_2);
				//calculmos potencia
				potencia(num_1, num_2);
				break;
			case "raiz cuadrada":
			case "raíz cuadrada":
				//introducimos 1r numero
				str_num_1 = JOptionPane.showInputDialog("Introduce la base");
				while (!isNumNatural(str_num_1)) {
					 str_num_1 = JOptionPane.showInputDialog("Introduce la base");
				}
				//parseamos resultados a int
				num_1 = Integer.parseInt(str_num_1);
				//hacemos raiz cuadrada
				raizCuandrada(num_1);
				break;
			case "raiz cubica":
			case "raiz cíbica":
			case "raíz cubica":
			case "raíz cúbica":
				//introducimos 1r numero
				str_num_1 = JOptionPane.showInputDialog("Introduce la base");
				while (!isNumNatural(str_num_1)) {
					 str_num_1 = JOptionPane.showInputDialog("Introduce la base");
				}
				//parseamos resultados a int
				num_1 = Integer.parseInt(str_num_1);
				//hacemos raiz cubica
				raizCubica(num_1);
				break;
				
			case "division":
			case "división":
				//introducimos 1r numero
				str_num_1 = JOptionPane.showInputDialog("Introduce el dividendo");
				while (!isNumNatural(str_num_1)) {
					 str_num_1 = JOptionPane.showInputDialog("Introduce el dividendo");
				}
				//introducimos 2do numero
				str_num_2 = JOptionPane.showInputDialog("Introduce el divisor");
				while (!isNumNatural(str_num_1)) {
					 str_num_2= JOptionPane.showInputDialog("Introduce el divisor");
				}
				//parseamos resultados a int
				num_1 = Integer.parseInt(str_num_1);
				num_2 = Integer.parseInt(str_num_2);
				//dividimos
				division(num_1, num_2);
				break;
			default:
				throw new CustomException(4);  // si no hay opción mostramos mensaje guardado en CustomExeption de la pt2
				
			}
		} catch (CustomException e) {
			is_operador = false;
			JOptionPane.showMessageDialog(null, e);
		}
		return is_operador;
	}
	
	// metodo para validar si string un int
	public static boolean isNumNatural(String numero) {
		boolean es_int = false;
		try {
			int num_usuario = Integer.parseInt(numero);
			es_int = true;
		} 
		catch (InputMismatchException e) {
			JOptionPane.showMessageDialog(null, "Exeption: No se ha introducido un numero entero.");
		}
		return es_int;
	}
	
	//suma
	public static void suma(int num_1 , int num_2) {
		int resultado;
		try {
			resultado = num_1 + num_2;
			JOptionPane.showMessageDialog(null, num_1 + "+" + num_2 + "=" + resultado);
		} catch (Error e) {
			JOptionPane.showMessageDialog(null, "Exeption: No se ha podido realizar la suma");
		}
	}
	
	//resta
	public static void resta(int num_1 , int num_2) {
		int resultado;
		try {
			resultado = num_1 - num_2;
			JOptionPane.showMessageDialog(null, num_1 + "-" + num_2 + "=" + resultado);
		} catch (Error e) {
			JOptionPane.showMessageDialog(null, "Exeption: No se ha podido realizar la resta");
		}
	}
	
	//multiplicacion
	public static void multiplicacion(int num_1 , int num_2) {
		int resultado;
		try {
			resultado = num_1 * num_2;
			JOptionPane.showMessageDialog(null, num_1 + "*" + num_2 + "=" + resultado);
		} catch (Error e) {
			JOptionPane.showMessageDialog(null, "Exeption: No se ha podido realizar la multiplicación");
		}
	}
	
	//potencia
	public static void potencia(int num_1 , int num_2) {
		double resultado;
		try {
			resultado = Math.pow(num_1, num_2);
			JOptionPane.showMessageDialog(null, num_1 + "^" + num_2 + "=" + String.format("%.2f", resultado));
		} catch (Error e) {
			JOptionPane.showMessageDialog(null, "Exeption: No se ha podido realizar la potencia");
		}
	}
	
	//raiz cuadrada
	public static void raizCuandrada(int num_1) {
		double resultado;
		try {
			resultado = Math.sqrt(num_1);
			JOptionPane.showMessageDialog(null, num_1 + "²=" + String.format("%.2f", resultado));
		} catch (Error e) {
			JOptionPane.showMessageDialog(null, "Exeption: No se ha podido realizar la raiz cuadrada");
		}
	}
	
	//raiz cubica
	public static void raizCubica(int num_1) {
		double resultado;
		try {
			resultado = Math.cbrt(num_1);
			JOptionPane.showMessageDialog(null, num_1 + "³=" + String.format("%.2f", resultado));
		} catch (Error e) {
			JOptionPane.showMessageDialog(null, "Exeption: No se ha podido realizar la raiz cúbica");
		}
	}
	
	//raiz cubica
	public static void division(int num_1, int num_2) {
		double resultado;
		try {
			resultado = (double) num_1 / (double) num_2;
			JOptionPane.showMessageDialog(null, num_1 + "/" + num_2 + "=" + String.format("%.2f", resultado));
		} catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "Exeption: No se puede dividir por 0.");
		}
	}
}
