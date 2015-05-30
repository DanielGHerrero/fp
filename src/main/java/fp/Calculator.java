package fp;

import java.util.List;

public class Calculator {
	/*
	 * este metodo calcula el seno de un angulo
	 */
	static Double sin(double n) {
		double seno=0;
		seno=Math.sin(n*2.0*Math.PI/360);
		return seno;
	}

	/*
	 * Escribir todos los números del number al 0 de step en step.
	 */
	static int[] stepThisNumber(int number, int step) {
		int[] result = null;
		for(int cont = 0;cont<number;cont++){
			number=number-step;
			result[cont]=number;
		}
		return result;
	}

	/*
	 * Módulo al que se le pasa un número entero del 0 al 20 y devuelve los
	 * divisores que tiene.
	 */
	static int[] divisors(int n) {
		int rest[] = null;
		for(int cont=0;cont<n;cont++){
			if(n%cont==0)
				rest[cont]=cont;
		}
		return rest;
	}
	
	/*
	 * Toma como parámetros dos listas. La primera con los 6 números de una
	 * apuesta de la primitiva, y la segunda con los 6 números ganadores. La
	 * función debe devolver el número de aciertos.
	 */
	static Integer checkMyBet(List<Integer> apuesta, List<Integer> aciertos) {
		return null;
	}

	/*
	 * Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56
	 * mostrar: cincuenta y seis
	 */
	static String speakToMe(int n) {
		return null;
	}
	
	/*
	 * este metodo devuelve cierto si el año de la fecha es bisiesto fecha
	 * dd-MM-yyyy
	 */
	static boolean isLeapYear(String fecha) {
		return false;
	}

	/*
	 * este metodo calgula la tangente de un angulo
	 */
	static boolean isValidDate(String date) {
		return false;
	}
}
