package ejercicios;

import java.util.Arrays;

public class Ejercicio04 {

	public static void main(String[] args) {
		//String para guardar la frase
		String frase = "La Campana es un pueblo";
		
		//Array para guardar las palabras por separado
		String[] palabras = frase.split(" ");
		
		//Ordeno el array de palabras
		Arrays.sort(palabras);
		
		//Muestro las palabras ordenadas
		for (int i=0; i<palabras.length; i++) {
			System.out.print(palabras[i] + " ");
		}
	}

}
