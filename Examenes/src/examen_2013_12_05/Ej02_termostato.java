package examen_2013_12_05;

import java.util.Scanner;

public class Ej02_termostato {
	static Scanner teclado;
	static boolean encendido = false;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		double temperatura, histeresis;

		System.out.println("Control de termostato:");
		System.out.println("----------------------");
		
		System.out.print("¿A qué temperatura quieres estar?: ");
		temperatura = teclado.nextDouble();
		
		System.out.print("¿Con qué histéresis trabajamos?: ");
		histeresis = teclado.nextDouble();

		System.out.println();
		
		while(true)
			termostato(pedirTemperatura(), temperatura, histeresis);		
	}


	private static void termostato(double pedirTemperatura, double temperatura, double histeresis) {
		double margen = encendido ? 
				temperatura + histeresis: 
				temperatura - histeresis;

		if(encendido && pedirTemperatura >= margen)
			encendido = !encendido;
		else if(!encendido && pedirTemperatura <= margen)
			encendido = !encendido;
		
		System.out.println("-----------------");
		System.out.print("--  ");
		System.out.print(encendido?"ENCENDIDO":" APAGADO ");
		System.out.println("  --");
		System.out.println("-----------------\n");
	}

	private static double pedirTemperatura() {
		double temp;
		System.out.print("Temperatura actual: ");
		temp = teclado.nextDouble();		
		return temp;
	}

}
