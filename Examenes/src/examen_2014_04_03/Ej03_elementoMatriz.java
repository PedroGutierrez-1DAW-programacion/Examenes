package examen_2014_04_03;

public class Ej03_elementoMatriz {
	private int x, y;
	private double valor;
	
	public Ej03_elementoMatriz(int x, int y, double value){
		this.x = x;
		this.y = y;
		this.valor = value;
	}
	
	public boolean enIgualPosicion(int x, int y){
		return this.x == x && this.y == y;
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getValor() {
		double redondeo = 10.0;
		return Math.round(this.valor * redondeo) / redondeo;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String toString(){
		return String.format("(%s, %s, %s)", this.x, this.y, this.valor);
	}
}
