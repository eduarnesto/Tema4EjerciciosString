package ejercicios;

public class Ejercicio07 {
	
	public static int buscaPalabra (String frase, String palabra) {
		int contador=0;
		String[] palabras = frase.split(" ");
		
		for (int i=0;i<palabras.length;i++) {
			if (palabra.equals(palabras[i])) {
				contador++;
			}
		}
		
		return contador;
	}

	public static void main(String[] args) {
		//String para guardar la frase
		String frase = "La campana es un pueblo con una campana";
		
		//String para guardar la palabra
		String palabra = "campana";
		
		//Variable para guardar el numero de veces que se repite la palabra
		int contador;
		
		//Llamo a la función
		contador = buscaPalabra(frase, palabra);
		
		//Muestro el número de veces que se repite la palabra
		System.out.println("La palabra se repite " + contador + " veces");

	}

}
