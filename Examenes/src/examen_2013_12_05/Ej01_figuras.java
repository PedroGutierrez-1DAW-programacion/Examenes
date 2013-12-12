package examen_2013_12_05;

import java.util.Scanner;

public class Ej01_figuras {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dame el tamaño de las figuras: ");
		int largo = teclado.nextInt();
		figura(1, largo);
		figura(2, largo);
		figura(3, largo);
		
		teclado.close();
	
	}

	private static void figura(int tipo, int largo) {
		int i = 0;
		System.out.println("Figura "+tipo);
		while(i++<largo){
			String linea = "";

			switch(tipo){
				case 2: linea += espacios(i);
				case 1: linea += puntos(largo - i + 1, false); break;
				case 3: linea += espacios(largo - i) + puntos(i, true); break;
			}
			System.out.println(linea);
		}
		
	}

	private static String puntos(int i, boolean espacioExtra) {
		String r="";
		while(i-->0) r += espacioExtra ? "@ " : "@";
		return r;
	}

	private static String espacios(int i) {
		String r="";
		while(i-->0) r+=" ";
		return r;
	}

}
