package examen_2014_06_09;

public class Ej02_juegoBingo {

	public static void main(String[] args) {

		//System.out.println(String.format("%2d%s ", 33, (Math.random()>0.5 ? "X" : " ")));
		//System.out.println(String.format("%2d%s ",  9, (Math.random()>0.5 ? "X" : " ")));
		/*
		Ej02_carton c = new Ej02_carton();
		
		
		int numeros = 91;

		System.out.println(c.esBingo());
		while(numeros-->0){
			c.marca(numeros);
		}
		System.out.println(c.esBingo());
		System.out.println(c);
		*/
		
		Ej02_bingo bingo = new Ej02_bingo();
		
		bingo.nuevoCarton();
		bingo.nuevoCarton();
		bingo.nuevoCarton();
		
		bingo.empezar();

	}

}
