package ejercicios;

import java.util.Scanner;

public class Ejercicio021 {

	public static void main(String[] args) {
		//String para la contraseña
		String contrasena;
		
		//String para el intento de adivinar la contraseña
		String intento;
		
		//Boolean para saber si se ha acertado la contaseña
		boolean acertado = false;
		
		//Contador para el while
		int contador = 1;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Le pido al jugador 1 que introduzca la contaseña
		System.out.println("Jugador 1 introduce la contraseña");
		
		//Leo del teclado
		contrasena = sc.nextLine();
		
		//Le pido al jugador 2 que intente acertar la contraseña
		while (!acertado && contador<=3) {
			
			//Pido al jugador 2 que intente adivinar la contraseña
			System.out.println("Jugador 2 intente advinar la contaseña");
			
			//Leo del teclado
			intento = sc.nextLine();
			
			//Compruebo si se ha acertado la palabra
			if (contrasena.equals(intento)) {
				acertado=true;
				continue;
			}
			
			//Recorro las dos cadenas comparando cada posición
			for (int i=0; i<contrasena.length()-(contrasena.length()-intento.length());i++) {
				if (contrasena.charAt(i)==intento.charAt(i)) {
					System.out.print(contrasena.charAt(i));
				} else {
					System.out.print("*");
				}
			}
			
			System.out.println();
			
			contador++;
		}
		
		//Muestro si se ha acertado la palabra
		if (acertado) {
			System.out.println("Jugador 2 ha acertado la contraseña");
		} else {
			System.out.println("Jugador 2 no ha acertado la contraseña");
		}
		
		//Cierro el Scanner
		sc.close();

	}

}
