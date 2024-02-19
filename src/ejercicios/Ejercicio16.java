package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		//String para guardar la palabra
		String palabra;
		
		//String para guardar el anagrama
		String anagrama = "";
		
		//String para guardar la respuesta
		String intento;
		
		//Array de char para guadra la palabra por letras
		char letras[];
		
		//Char auxiliar para desordenar la palabra
		char aux;
		
		//Variable para la posicion
		int pos;
		
		//Variable para el numero de letras acertadas
		int aciertos;
		
		//Boolean para saber si ha acertado la palabra
		boolean acertado = false;
		
		//Random para generar numero al azar
		Random rand = new Random();
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner (System.in);
		
		//Pregunto por la palabra
		System.out.println("Jugador 1, introduzca una palabra");
		
		//Leo del teclado
		palabra = sc.next();
		
		//Creo el anagrama
		letras = palabra.toCharArray();
		
		//Bucle que intercambia aleatoriamente la posion de las letras
		for(int i=0; i<letras.length;i++) {
			pos = rand.nextInt(0,letras.length);
			aux=letras[i];
			letras[i]=letras[pos];
			letras[pos]=aux;
		}
		
		//Bucle que guarda el anagrama en un String
		for (int i=0; i<letras.length;i++) {
			anagrama += letras[i];
		}
		
		//Hago que el jugador 2 adivine la palabra
		while (!acertado) {
			//Pregunto al jugador 2
			System.out.println("Jugador 2, intente adivinar la palabra con este anagrama " + anagrama);
			
			//Leo del teclado
			intento = sc.next();
			
			//Compruebo si es la palabra
			if (palabra.equals(intento)) {
				acertado = true;
				continue;
			}
			
			aciertos=0;
			
			//Comrpuebo cuantas letras ha acertado
			for (int i=0; i<palabra.length();i++) {
				if (palabra.charAt(i)==intento.charAt(i)) {
					System.out.println(palabra.charAt(i) + " " + intento.charAt(i));
					aciertos++;
				}
			}
			
			System.out.println("Prueba otra vez, has acertado " + aciertos + " letras");
		}
		
		System.out.println("Enhorabuena, has acertado");
		
		//Cierro el Scanner
		sc.close();
	}

}
