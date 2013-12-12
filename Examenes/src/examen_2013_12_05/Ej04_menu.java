package examen_2013_12_05;

import java.util.Scanner;

public class Ej04_menu {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String[] opciones = new String[20];
		int largo;
	

		System.out.println("Bienvenido a Menú Generator.\n");
		System.out.println("Recopilamos ocipiones (escribimos * para terminar)\n");
		
		for(largo = 0; largo<opciones.length; largo++){
			System.out.print("Dame una opción: ");
			opciones[largo] = teclado.nextLine();
			if(opciones[largo].equals("*"))
				break;
		}
		
		while(true){
			System.out.println("\n*  Menú  *\n**********");
			for(int i=0; i<largo; i++)
				System.out.println((i+1) + " " + opciones[i]);
			System.out.println((largo+1) + " Salir");
			
			System.out.print("Opción elegida: ");
			String eleccion = teclado.nextLine();
			
			if("salir".equalsIgnoreCase(eleccion)){
				System.out.println("Elección: " + (largo+1));
				break;
			}
			
			System.out.println("Elección: " + posicion(opciones, largo, eleccion));	
		}
		
		teclado.close();
	}

	private static String posicion(String[] opciones, int largo, String texto) {
		int n=0;
		for(; n<largo; n++)
			if(opciones[n].equalsIgnoreCase(texto)) break;
		String r = n==largo ? "no válida" : ""+(n + 1);
		return r;
	}
}
