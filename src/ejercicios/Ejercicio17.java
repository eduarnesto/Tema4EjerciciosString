package ejercicios;

public class Ejercicio17 {
	public static final String FIN = "*/";
	public static final String INICIO = "/*";

	public static String sinComentarios(String codigoC) {
		String cadSinComentarios = "";
		int inicio = codigoC.indexOf(INICIO);
		int fin = 0;
		
		while(inicio!=-1) {
			cadSinComentarios += codigoC.substring(fin, inicio);
			fin = codigoC.indexOf(FIN, inicio)+FIN.length();
			inicio = codigoC.indexOf(INICIO, fin);
		}
		
		return cadSinComentarios;
	}
	
	public static void main(String[] args) {
		//String para guardar la cadena con la frase
		String codigoC = "/* comentario inicial*/ if (a==3) /* igual a tres */ a++; /* incrementamos a */";
		
		//Imprimo el resultado
		System.out.println(sinComentarios(codigoC));
	}
}