package ejercicios;

public class Ejercicio19 {

	public static void main(String[] args) {
		//String para guardar la variable
		String frase = "Notacion caMel";
		
		//Strin para guardar la frase en notacion Camel
		String camel="";
		
		camel = camel(frase, camel);
		
		//Imprimo el resultado
		System.out.println(camel);
	}

	public static String camel(String frase, String camel) {
		//Array de string para separar las palabras
		String[] palabras;
		
		//Paso todas las letras a minuscuals
		frase = frase.toLowerCase();
		
		//Separo las cadenas por espacios
		palabras = frase.split(" ");
		
		//Cambio la primera letra de cada palabra a partir de la primera a mayuscula
		for (int i=1; i<palabras.length;i++) {
			palabras[i]=palabras[i].toUpperCase().charAt(0)+palabras[i].substring(1);
		}
		
		//Paso la cadena de palabras a un String
		for (int i=0; i<palabras.length;i++) {
			camel+=palabras[i];
		}
		return camel;
	}

}
