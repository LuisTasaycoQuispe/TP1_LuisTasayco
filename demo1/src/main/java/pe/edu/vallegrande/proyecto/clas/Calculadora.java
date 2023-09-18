package pe.edu.vallegrande.proyecto.clas;

public class Calculadora {

	public static int operacion(int numero1, int numero2, String operacion) {
		int resultado = 0;

		switch (operacion) {
		case "-": {
			resultado = numero1 - numero2;
			break;
		}
		case "+": {
			resultado = numero1 + numero2;
			break;
		}
		case "*": {
			resultado = numero1 * numero2;
			break;
		}
		case "/": {
			resultado = numero1 / numero2;
			break;
		}
		case "%": {
			resultado = numero1 % numero2;
			break;
		}
		}
		return resultado;
	}
}
