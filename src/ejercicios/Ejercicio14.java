package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		//String para guardar la frase
		String frase;
		
		//String para guardar la frase con todas las letrs minusculas
		String copia;
		
		//Array de caracteres para guardar la frase
		char letras[];
		
		//Contador para saber cuantas veces se repite cada letra
		int contador=0;
		
		//Boolano para saber si las letras son iguales
		boolean igual;
		
		//Posicion para saber la posicion del array
		int posEmpieza=0;
		
		//Posicion para saber la posicion del array
		int posActual=0;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner (System.in);
		
		//Pregunto por una frase
		System.out.println("Introduzca una frase");
		
		//Leo del teclado
		frase = sc.nextLine();
		
		//Transformo la frase en todo minusculas
		copia = frase.toLowerCase();
		
		//Transformo la frase en una array de caracteres
		letras = copia.toCharArray();
		
		//Ordeno el array de caracteres
		Arrays.sort(letras);
		
		//Recorro el Array y cuento cuantas veces se repite cada letra
		while (posEmpieza<letras.length) {
			contador=1;
			igual=true;
			posEmpieza=posActual;
			posActual++;
			while (posActual<letras.length && igual) {
				if (letras[posEmpieza]!=letras[posActual]) {
					igual = false;
					posEmpieza=posActual;
					continue;
				}
				contador++;
				posActual++;
			}
			System.out.println("La letra " + letras[posEmpieza-1] + " se repite " + contador + " veces");
		}
		
		//Cierro el Scanner
		sc.close();
	}

}
