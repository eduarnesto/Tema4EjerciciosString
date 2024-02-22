package ejercicios;

import java.util.Arrays;

public class Ejercicio20 {

	public static void main(String[] args) {
		// String para guardar la frase
		String frase = "hada";

		// Numero que indica cuantas letras debe de tener cada parte
		int letras = 3;

		//Llamo a la funcion para separar cadenas
		String[] palabras = separaCadenas(frase, letras);

		// Muestro el resultado
		System.out.println(Arrays.toString(palabras));
	}

	public static String[] separaCadenas(String frase, int letras) {
		// Arrays de string para guardar la frase separada
		String[] palabras = new String[frase.length() / letras];
		
		//Calculo el tamano del array
		if (frase.length() % letras == 0) {
			palabras = new String[frase.length() / letras];
		} else {
			palabras = new String[(frase.length() / letras)+1];
		}
		
		// Relleno el array de String
		for (int i = 0; i < palabras.length; i++) {
			if (letras * (i + 1)<frase.length()) {
				palabras[i] = frase.substring(i * letras, letras * (i + 1));
			} else {
				palabras[i] = frase.substring(i * letras);
			}
		}
		return palabras;
	}

}
