package ejercicios;

public class Ejercicio18 {
	
	public static String codigo(String titulo, String parrafo) {
		String codigo="";
		
		codigo="<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>Document</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "    <h1>" + titulo + "</h1>\r\n"
				+ "    <p>" + parrafo + "<p>\r\n"
				+ "</body>\r\n"
				+ "</html>";
		
		return codigo;
	}

	public static void main(String[] args) {
		//String para el titulo
		String titulo="Campana City";
		
		//String para el parrafo
		String parrafo="Lorem Impsum";

		//Muestro el codigo
		System.out.println(codigo(titulo, parrafo));
	}

}
