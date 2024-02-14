package ejercicios;

public class Ejercicio03 {
	
	public static int cuentaEspacios (String frase) {
		int espacios=0;
		
		for (int i=0; i<frase.length(); i++) {
			if (frase.charAt(i)==' ') {
				espacios++;
			}
		}
		
		return espacios;
	}

	public static void main(String[] args) {
		//Variable para guardar el numero de espacios
		int numEspacios;
		
		//String para guardar una frase
		String frase = "La Campana es un pueblo";
		
		//Llamo a la funcion
		numEspacios = cuentaEspacios(frase);
		
		//Muestro el numero de espacios
		System.out.println("Hay " + numEspacios + " espacios");
		
	}

}
