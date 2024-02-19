package ejercicios;

public class Ejercicio11 {

	public static char codifica(char conjunto1[],char conjunto2[], char caracter) {
		char caracterCodificado=' ';
		
		for (int i=0; i<conjunto1.length;i++) {
			if (conjunto1[i]==Character.toLowerCase(caracter)) {
				caracterCodificado=conjunto2[i];
			}
		}
		
		return caracterCodificado;
	}
	
	public static void main(String[] args) {
		//Arrays de char para guardar la primera parte de la codificacion
		final char CONJUNTO1[]= {'e', 'i','k','m','p','q','r','s','t','u','v'};
		
		//Arrays de char para guardar la segunda parte de la codificacion
		final char CONJUNTO2[]= {'p','v','i','u','m','t','e','r','k','q','s'};

		//Char para guardar el caracter que se quiere codificar
		char caracter = 'E';
		
		//Char para guardar el caracter codificado
		char caracterCodificado;
		
		//Llamo a la funcion para codificar el caracter
		caracterCodificado = codifica(CONJUNTO1, CONJUNTO2, caracter);
		
		//Muestro el resultado
		System.out.println(caracter + " --> " + caracterCodificado);
	}

}