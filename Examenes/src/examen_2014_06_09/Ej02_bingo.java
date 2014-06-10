package examen_2014_06_09;

import java.util.Vector;

public class Ej02_bingo {
	private Vector<Integer> bolas = new Vector<Integer>();
	private Vector<Ej02_carton> cartones = new Vector<Ej02_carton>();
	private final int maxBolas = 90;
	
	public Ej02_bingo(){		
		while(this.bolas.size() < maxBolas)
			this.bolas.add(this.bolas.size() + 1);;
	}
	public void empezar(){
		boolean terminado = false;
		
		while(!terminado && quedanBolas()){
			terminado = sacar();
		}
		
		mostrarCartones();
	}
	
	private void mostrarCartones() {
		for(int i=0; i<this.cartones.size(); i++){
			if(this.cartones.elementAt(i).esBingo())
				System.out.println("¡Ha ganado!");
			System.out.println(this.cartones.elementAt(i));
			
		}
		
	}
	public void nuevoCarton(){
		this.cartones.add(new Ej02_carton());
	}
	
	/**
	 * @return boolean : hay ganador o no, para parar la salida de bolas
	 */
	public boolean sacar(){
		int aleatorio = aleatorioConRango(0, this.bolas.size() - 1);
		
		int numero = this.bolas.elementAt(aleatorio);
		this.bolas.removeElementAt(aleatorio);
		
		marcarCartones(numero);
		return comprobarGanador();
	}
	
	private boolean comprobarGanador() {
		for(int i=0; i<this.cartones.size(); i++)
			if(this.cartones.elementAt(i).esBingo()) return true;
		return false;
	}
	private void marcarCartones(int numero) {
		for(int i=0; i<this.cartones.size(); i++)
			this.cartones.elementAt(i).marca(numero);		
	}
	
	public boolean haSalaido(int n){
		return this.bolas.indexOf(n) != -1;
	}
	
	public boolean quedanBolas(){
		return this.bolas.size() != 0;
	}

	private int aleatorioConRango(int min, int max) {
		return (int) ((Math.random() * ((max + 1) - min)) + min);
	}
}
