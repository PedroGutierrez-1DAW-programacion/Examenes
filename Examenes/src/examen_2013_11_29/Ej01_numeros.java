package examen_2013_11_29;

import java.util.Scanner;

public class Ej01_numeros {

	public static void main(String[] args) {
		
		int	positivos = 0,
			negativos = 0,
			n;
		double media = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Números a leer: ");
		
		n = teclado.nextInt();
		
		System.out.println("Escribe " + n + " números:");
		
		int[] numeros = new int[n];
		
		// Pide los números
		for(int i=0; i<n; i++)
			numeros[i] = teclado.nextInt();
		
		// Busca negativos y positivos y hace suma de los números para la media
		for(int i=0; i<n; i++){
			if(numeros[i]>0)
				positivos++;
			if(numeros[i]<0)
				negativos++;
			media += numeros[i];
		}		
		
		
		// Muestra los datos
		System.out.println("Positivos: " + positivos);
		System.out.println("Negativos: " + negativos);
		System.out.println("Media: " + Math.round(media / (double)(n) * 100) / 100.0);
		
		teclado.close();
	}

}
