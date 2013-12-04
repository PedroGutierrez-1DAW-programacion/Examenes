package examen_2013_11_29;

import java.util.Scanner;

public class Ej03_haiku {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		do{
			generarHaiku();
			System.out.println("\nGenerar otro Haiku? [s/n]: ");
		}while("s".equals(teclado.nextLine()));
			
		teclado.close();
	}

	private static void generarHaiku() {
		int	min = 3,
			max = 40,
			largoHaiku = 3,
			n = -1;
		String[] frases = new String[max];
		
		System.out.println("Bienvenido al Haiku Generator\n\nPara terminar escribe: *\n");
		
		while(n++<max){
			System.out.print("Introduce un verso: ");
			frases[n] = teclado.nextLine();
			if(n>=min && frases[n].equals("*"))  break;
		}
		
		System.out.println("\n\nHaiku\n************");
		
		for(int i=0; i<largoHaiku; i++){
			int r = (int)(Math.random() * n);
			System.out.println(frases[r]);
		}
		
	}

}
