package examen_2013_12_05;

import graphics.*;

import java.util.Scanner;

public class Ej03_cuadrado {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] rgb = new int[3];
		int ladoCuadrado;
		int	ladoMax = 200,
			ladoMin = 100;
		boolean rgbValido = true;
		
		do System.out.print("Dame el lado del cuadrado [100, 200]: ");
		while((ladoCuadrado = teclado.nextInt()) < ladoMin || ladoCuadrado > ladoMax);
		
		do{
			rgbValido = true;
			System.out.print("Dame los valores del color (R, G, B): ");
			rgb[0] = teclado.nextInt();
			rgb[1] = teclado.nextInt();
			rgb[2] = teclado.nextInt();
			for(int i=0; i<rgb.length; i++){
				if(rgb[i] < 0 || rgb[i] > 255) rgbValido = false;
			}
		}while(!rgbValido);
		
		Rectangle cuadrado = new Rectangle(10, 10, ladoCuadrado, ladoCuadrado);
		cuadrado.setColor(new Color(rgb[0], rgb[1], rgb[2]));
		cuadrado.fill();
		
		
		teclado.close();
		

	}

}
