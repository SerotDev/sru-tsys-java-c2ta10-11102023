package PT2;

public class CustomException extends Exception{
	private int codigo_exception;
	
	public CustomException(int codigo_error) {
		super();
		this.codigo_exception = codigo_error;
	}
	
	// Metodo propio para mostrar mensajes custom
	@Override
	public String getMessage() {
		String message = "";
		switch (codigo_exception) {
		//PT2
		case 1:
			message = "Excepcion capturada por mensaje.";
			break;
		//PT3
		case 2:
			message = "Es par.";
			break;
		case 3:
			message = "Es impar.";
			break;
		//PT4
		case 4:
			message = "Tipo de operacion no correcta.";
			break;
		default:
			break;
		}
		return message;
	}
	
}
