package ejercicios;

import java.util.Scanner;

public class Ejercicio09 {
	
	public static void traduce(String frase, String[]traduccion) {
		//Compruebo el idioma en el que está la frase y lo traduzco si es necesario
		if (frase.startsWith("Javalín, javalón")) {
			traduccion[1]="Javalandia 1er dialecto";
			traduccion[2]=frase.replace("Javalín, javalón", "");
		} else if (frase.endsWith("javalén, len, len")) {
			traduccion[1]="Javalandia 2do dialecto";
			traduccion[2]=frase.replace("javalén, len, len", "");
		} else {
			traduccion[1]="otro idioma";
			traduccion[2]=frase;
		}
		
		//Quito los espacios y tabuladores
		traduccion[2] = traduccion[2].trim();
	}

	public static void main(String[] args) {
		//String para guardar la frase
		String frase;
		
		//Array de String para guardar la traduccion y el dialecto
		String traduccion[] = new String[2];
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner (System.in);
		
		//Pregunto al usuario por una frase
		System.out.println("Introduzca una frase");
		
		//Leo del teclado
		frase = sc.nextLine();
		
		//Llamo a la función para traducir
		traduce (frase, traduccion);
		
		//Muestro el resultado
		System.out.println("El mesaje introducido es de " + traduccion[1] + " traducido a nuestro idoma sería " + traduccion[2]);
		
		//Cierro el Scanner
		sc.close();
	}

}