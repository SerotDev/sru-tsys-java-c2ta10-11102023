package PT2;

public class Pt2MainApp {

	public static void main(String[] args) {
		try {
			System.out.println("Hola soy un mensaje!");
			throw new CustomException(1);
		} catch (CustomException e) {
			System.out.println(e.getMessage());
			System.out.println("Fin de programa!");
		} 
	}

}
