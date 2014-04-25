package examen_2014_04_10;

import java.util.Scanner;

public class Ej02_distanciaEntrePuntos {
	
	private static Scanner scn;

	public static void main(String[] args) {
		
		int x1, y1, x2, y2;
		
		try {
			// Controlamos el error, por controlar alguno...
			scn = new Scanner(System.in);
		} catch (Exception e) {
			System.err.printf("Error al abrir Scanner [%s]", e.getMessage());
		}

		System.out.println("Punto 1:");
		x1 = pedirDato("[Eje X]");
		y1 = pedirDato("[Eje Y]");
		
		System.out.println("Punto 2:");
		x2 = pedirDato("[Eje X]");
		y2 = pedirDato("[Eje Y]");
		
		System.out.println("Distancia entre los puntos: " + (Math.round(distanciaPuntos(x1, x2, y1, y2) * 100.0) / 100.0));

	}

	private static int pedirDato(String nombre) {
		String dato = "-1";
		
		System.out.println(nombre);
		
		do System.out.print("  => ");
		while(!(new String(dato = scn.nextLine())).matches("[0-9]{1,3}"));
		
		return new Integer(dato);
	}
	
	private static double distanciaPuntos(int x1, int x2, int y1, int y2) {
		return 
			Math.sqrt(
					Math.pow(x1 - x2, 2) +
					Math.pow(y1 - y2, 2)	
			);
	}

}
