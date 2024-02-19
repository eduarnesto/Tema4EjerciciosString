package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio141 {

	public static void main(String[] args) {
		//String para guardar la frase
		String frase;
		
		//String para guardar la frase con todas las letrs minusculas
		String copia;
		
		//Array de caracteres para guardar la frase
		char letras[];
		
		//Contador para saber cuantas veces se repite cada letra
		int contador=1;
		
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
		for (int i=0; i<letras.length;i+=contador) {
			contador=1;
			for (int j=i+1; j<letras.length;j++) {
				if (letras[i]==letras[j]) {
					contador++;
				}
			}
			System.out.println("La letra " + letras[i] + " se repite " + contador + " veces");
		}
		
		//Cierro el Scanner
		sc.close();
	}

}
