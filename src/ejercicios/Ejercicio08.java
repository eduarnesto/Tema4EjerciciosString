package ejercicios;

public class Ejercicio08 {

	public static boolean palindromo(String frase) {
		boolean palindromo = true;
		int contador=0;
		
		//Quito los espacios a la cadena
		frase=frase.replace(" ", "");
		
		//Compruebo que sea un palindromo
		while (palindromo && contador<(frase.length()/2)) {
			if (frase.charAt(contador)!=frase.charAt(frase.length()-1-contador)) {
				palindromo=false;
			}
			contador++;
		}
		
		return palindromo;
	}
	
	public static void main(String[] args) {
		//String para guardar la frase
		String frase = "aaeaa";
		
		//Booleano para saber si es palíndroma
		boolean palindromo;

		//Llamo a la funcion
		palindromo = palindromo(frase);
		
		//Muestro si es un palindromo
		System.out.println(palindromo);
	}

}
