package ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		//String para las palabras
		String palabra;
		
		//String para guardar la frase
		String frase="";
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner (System.in);
		
		//Pregunto por la primera palabra
		System.out.println("Introduzca una palabra");
		
		//Leo del teclado
		palabra = sc.nextLine();
		
		while (!"fin".equalsIgnoreCase(palabra)) {
			frase += palabra + " ";
			
			//Pregunto por otra palabra
			System.out.println("Introduzca una palabra");
			
			//Leo del teclado
			palabra = sc.next();
		}
		
		//Muestro la frase final
		System.out.println(frase);
		
		//Cierro el Scanner
		sc.close();
	}

}
