package ejercicios;

public class Ejercicio05 {

	public static String cadenaReves (String frase) {
		String reves = "";
		
		for (int i=frase.length()-1; i>=0;i--) {
			reves += frase.charAt(i);
		}
		
		return reves;
	}
	
	public static void main(String[] args) {
		//String para guardar la frase
		String frase = "La Campana es un pueblo";
		
		//String para guardar la frase al revés
		String reves = cadenaReves(frase);
		
		//Muestro la frase al revés
		System.out.println(reves);
	}

}
