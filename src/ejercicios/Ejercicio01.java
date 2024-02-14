package ejercicios;

public class Ejercicio01 {

	public static void main(String[] args) {
		//String para guardar una frase
		String frase1="  ";
		
		//String para guardar otra frase
		String frase2=" ";
		
		//Compruebo que frase es más corta
		if(frase1.length()<frase2.length()) {
			System.out.println("La frase más corta es la frase 1");
		} else if (frase1.length()>frase2.length()) {
			System.out.println("La frase más corta es la frase 2");
		} else {
			System.out.println("Las dos frases son igual de largas");
		}
	}

}
