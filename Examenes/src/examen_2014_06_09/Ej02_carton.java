package examen_2014_06_09;

public class Ej02_carton {
	private int[][] numeros = new int[9][3];
	private boolean[][] acertados = new boolean[9][3];
	
	public Ej02_carton(){
		rellenaAleatorio();
	}
	
	public void marca(int bola){
		for(int y=0; y<numeros.length; y++)			
			for(int x=0; x<numeros[y].length; x++)
				if(numeros[y][x] == bola)
					marcaXY(x, y);
		
	}

	public void marcaXY(int x, int y){
		acertados[y][x] = true;
	}
	
	public boolean esBingo(){
		for(int y=0; y<numeros.length; y++)			
			for(int x=0; x<numeros[y].length; x++)
				if(acertados[y][x] == false)
					return false;
		return true;		
	}
	
	public String toString(){
		StringBuffer resultado = new StringBuffer();
			
		for(int x=0; x<numeros[0].length; x++){
			for(int y=0; y<numeros.length; y++){
				resultado.append(String.format("%2d%s  ", numeros[y][x], (acertados[y][x] ? "X" : " ")));
			}
			resultado.append("\n");
		}
		
		return resultado.toString();
	}

	private void rellenaAleatorio() {
		for(int y=0; y<numeros.length; y++){
			int min = y * 10;
			int max = ((y + 1) * 10) - 1;
			
			if(min == 0) min = 1;
			if(max == 89) max = 90;
			
			for(int x=0; x<numeros[y].length; x++){
				int aleatorio = 0;
				boolean repetido = true;
				
				while(repetido){
					aleatorio = aleatorioConRango(min, max);
					
					repetido = contiene(numeros[y], aleatorio);
						
					numeros[y][x] = aleatorio;
				}
			}
		}
	}

	private boolean contiene(int[] array, int n) {
		for(int i : array)
			if(i == n) return true;
		return false;
	}

	private int aleatorioConRango(int min, int max) {
		return (int) ((Math.random() * ((max + 1) - min)) + min);
	}
}
