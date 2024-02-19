package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		//String para guardar la frase
		String frase;
		
		//Array para guardar las palabras
		String palabras[];
		
		//String para guardar la palabra más grande
		String palabraMayor = "";
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner (System.in);

		//Pregunto por la frase
		System.out.println("Introduzca una frase");
		
		//Leo del teclado
		frase = sc.nextLine();
		
		//Separo la frase por palabras
		palabras = frase.split(" ");
		
		//Busco la palabra más grande
		for (int i=0; i<palabras.length; i++) {
			if (palabras[i].length()>palabraMayor.length()) {
				palabraMayor = palabras[i];
			}
		}
		
		//Muestro la palabra más grande
		System.out.println("La palabra más grande de la frase es " + palabraMayor);
		
		//Cierro el Scanner
		sc.close();
	}

}
