package fp;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Calculator {
	/*
	 * este metodo calcula el seno de un angulo
	 */
	static Double sin(double n) {
		double x = Math.toRadians(n);
		return (Math.ceil(Math.sin (x)*10))/10 ;
	}

	/*
	 * Escribir todos los números del number al 0 de step en step.
	 */
	static int[] stepThisNumber(int number, int step) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		while (number> step){
			number=number-step;
			numbers.add(number);
		}
		
		//int[] numbs = numbers.toArray(new int[numbers.size()]);
		
		int[] numbs = new int[numbers.size()];
		    Iterator<Integer> iterator = numbers.iterator();
		    for (int i = 0; i < numbs.length; i++)
		    {
		        numbs[i] = iterator.next().intValue();
		    }
		
		return numbs;
	}

	/*
	 * Módulo al que se le pasa un número entero del 0 al 20 y devuelve los
	 * divisores que tiene.
	 */
	static int[] divisors(int n) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int [] nums = null;
		if(n == 0){
			numbers = null;
		}else{
		int x=n;
		for (int y=0;y<n;y++){
			if (n%x==0) numbers.add(x);
		x--;
		
		}
		nums = new int [numbers.size()];
		for(int cont = 0; cont < numbers.size(); cont++){
			nums [cont] = numbers.get(cont);
			}
		}
	return nums;
}
	
	/*
	 * Toma como parámetros dos listas. La primera con los 6 números de una
	 * apuesta de la primitiva, y la segunda con los 6 números ganadores. La
	 * función debe devolver el número de aciertos.
	 */
	static Integer checkMyBet(List<Integer> bet, List<Integer> hits) {
		if (bet==null && hits==null) return 0;
		int resp=0;
		for (int x=0;x<hits.size();x++)
	        if(hits.get(x).equals(bet.get(x))) resp++;
	return resp;
	}

	/*
	 * Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56
	 * mostrar: cincuenta y seis
	 */
	static String speakToMe(int n) {
		
		 String[] numbers20 = { "Cero", "Uno", "Dos", "Tres",
		            "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez",
		            "Once", "Doce", "Trece", "Catorce", "Quince", "Dieciseis",
		            "Diecisiete", "Dieciocho", "Diecinueve", "Veinte" };

		 String[] decenas = { "Venti", "Treinta", "Cuarenta",
		            "Cincuenta", "Sesenta", "Setenta", "Ochenta", "Noventa" };
		 
		 String[] unidades = { "cero", "uno", "dos", "tres",
		            "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
		String resp="";
		int x=0;
		if(n>=0 && n<=20)
			resp = numbers20[n];
		if(n>20 && n<=29){
			x=n%10;
			resp = decenas[0]+unidades[x];
		}
		if(n>29){
			x=n%10;
			n=n/10;
			n=n-2;
			if(x!=0)
				resp = decenas[n] + " y " + unidades[x];
			else 
				resp = decenas[n];
		}
		return resp;
	
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
