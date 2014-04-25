package examen_2014_04_10;

import java.util.Vector;

public class Ej01_numeroRepetidos {

	public static void main(String[] args) {
		
		int[] numeros1, numeros2;
		
		numeros1 = new int[]{1,2,3,4,5,2,8,3,2};
		numeros2 = new int[]{2,5,7,2,3,5,2,7,7,2,9,5};

		System.out.println("Numeros 1:");
		presentarRepetidos(hayRepetidos(numeros1));

		System.out.println("Numeros 2:");
		presentarRepetidos(hayRepetidos(numeros2));

	}

	private static Integer[] hayRepetidos(int[] numeros){
		int max = 0;
		Vector<Integer> respuesta = new Vector<Integer>();
		int[] repeticiones;
		
		for(int n : numeros)
			if(n > max) max = n;
		
		repeticiones = new int[max + 1];
		
		for(int n : numeros)
			repeticiones[n]++;
		
		for(int i=0; i<repeticiones.length; i++)
			if(repeticiones[i] > 1)
				respuesta.add(i);
		
		return respuesta.toArray(new Integer[respuesta.size()]);
	}
	
	private static void presentarRepetidos(Integer[] repetidos) {
		System.out.print("[");
		
		for(int i=0; i<repetidos.length; i++)
			System.out.printf("%s%s", i!=0 ? "," : "", repetidos[i]);
		
		System.out.println("]");
		
	}
	

}
