package examen_2014_06_09;

public class Ej01_mezclador {

	public static void main(String[] args) {

		System.out.println(mix("Hola", "Mundo", 2));
		
		System.out.println(mix("Programación en", "Java", 2));

	}

	private static String mix(String a, String b, int tamanio) {
		StringBuilder mezcla = new StringBuilder();
		
		int largo = a.length() + b.length();
		int i = 0;
		
		while(largo > mezcla.length()){
			mezcla.append(substring(a, i, tamanio));
			mezcla.append(substring(b, i, tamanio));
			i++;
		}
		
		return mezcla.toString();
	}

	private static String substring(String texto, int parte, int tamanio) {
		if(texto.length() <= (tamanio * parte)) return "";
		
		String porcion = null;
		int tope;
		
		if(texto.length() < ((tamanio * parte) + 2))
			tope = texto.length();
		else
			tope = (parte * tamanio) + 2;
		
		porcion = texto.substring((parte * tamanio), tope);
		
		return porcion;
	}
	
	

}
