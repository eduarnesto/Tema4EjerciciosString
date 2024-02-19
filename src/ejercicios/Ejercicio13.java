package ejercicios;

import java.util.Arrays;

public class Ejercicio13 {
	
	public static boolean anagrama(String palabra1, String palabra2) {
		boolean anagrama = false;
		char[] letras1;
		char[] letras2;
		
		letras1 = palabra1.toCharArray();
		letras2 = palabra2.toCharArray();
		
		Arrays.sort(letras1);
		Arrays.sort(letras2);
		
		System.out.println(letras2);
		
		if (Arrays.equals(letras1,letras2)) {
			anagrama = true;
		}
		
		return anagrama;
	}

	public static void main(String[] args) {
		//String para guardar la primera palabra
		String palabra1 = "amor";
		
		//String para guardar la segunda palabra
		String palabra2 = "ramo";
		
		//Booleano para guardar si es un anagrama
		boolean anagrama;
		
		//Llamo a la funcion
		anagrama = anagrama(palabra1, palabra2);
		
		//Muestro si las dos palabras son anagramas
		System.out.println("¿Son las dos palabras anagramas? " + anagrama);

	}

}
