package examen_2014_06_09;

public class Ej03_dado {
	private int valor;
	
	public Ej03_dado(){
		tirar();
	}

	public void tirar() {
		this.valor = aleatorioConRango(1,6);		
	}
	
	public int getValor(){
		return this.valor;
	}
	public String toString(){
		return "Valor: " + getValor();
	}


	private int aleatorioConRango(int min, int max) {
		return (int) ((Math.random() * ((max + 1) - min)) + min);
	}

}
