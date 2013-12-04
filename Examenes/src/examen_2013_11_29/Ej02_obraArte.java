package examen_2013_11_29;

import graphics.*;

import java.util.Scanner;

public class Ej02_obraArte {
	static int dimensiones, figuras;
	static int borde = 20;

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		System.out.print("Tamaño del cuadro: ");
		dimensiones = teclado.nextInt();

		System.out.print("Número de figuras: ");
		figuras = teclado.nextInt();

		dibujarMarco();
		
		while(figuras-->0){
			nuevaFigura();
		}
		
		teclado.close();

	}

	private static void dibujarMarco() {
		Rectangle marco = new Rectangle(0, 0, dimensiones, dimensiones);
		marco.setColor(colorAleatorio());
		marco.fill();
		Rectangle lienzo = new Rectangle(borde, borde, dimensiones - (borde * 2), dimensiones - (borde * 2));
		lienzo.setColor(Color.WHITE);
		lienzo.fill();
		
	}

	private static void nuevaFigura() {
		int r = (int)(Math.random() * 4);
		switch(r){
			case 0: dibujaCuadrado();break;
			case 1: dibujaCirculo();break;
			case 2: dibujaDAW();break;
			case 3: dibujaLinea();break;
		}
		
	}

	private static void dibujaCuadrado() {
		int[] coord = coordenadasAleatorias();
		Rectangle cuadrado = new Rectangle(
				coord[0],
				coord[1],
				coord[2] - coord[0],
				coord[3] - coord[1]
		);
		cuadrado.setColor(colorAleatorio());
		cuadrado.fill();
	}

	private static void dibujaCirculo() {
		int[] coord = coordenadasAleatorias();
		Ellipse circulo = new Ellipse(
				coord[0],
				coord[1],
				coord[2] - coord[0],
				coord[3] - coord[1]
		);
		circulo.setColor(colorAleatorio());
		circulo.fill();
	}

	private static void dibujaLinea() {
		int[] coord = coordenadasAleatorias();
		Line linea = new Line(
				coord[0], coord[1],
				coord[2], coord[3]
		);
		linea.setColor(colorAleatorio());
		linea.draw();
	}

	private static void dibujaDAW() {
		int[] coord = coordenadasAleatorias();
		Text texto = new Text((coord[0] + coord[2]) / 2, (coord[1] + coord[3]) / 2, "DAW");
		texto.setColor(colorAleatorio());
		texto.draw();
		
	}
	
	/**
	 * Devuelve unas coordenadas aleatorias
	 * @return int[]
	 * 0 => X menor
	 * 1 => Y menor
	 * 2 => X mayor
	 * 3 => Y mayor
	 */
	private static int[] coordenadasAleatorias() {
		int[] coord = new int[4];
		int	x1 = numeroEnRango(),
			x2 = numeroEnRango(),
			y1 = numeroEnRango(),
			y2 = numeroEnRango();

		coord[0] = x1>x2?x2:x1;
		coord[1] = y1>y2?y2:y1;
		coord[2] = x1<x2?x2:x1;
		coord[3] = y1<y2?y2:y1;
		
		return coord;
	}

	private static int numeroEnRango() {
		return (int)(borde + ((dimensiones - (borde * 2)) * Math.random()));
	}

	private static Color colorAleatorio() {
		return new Color(r(),r(),r());
	}

	private static int r() {
		return (int)(Math.random() * 255);
	}
	
}
