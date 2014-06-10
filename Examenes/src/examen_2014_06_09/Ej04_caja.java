package examen_2014_06_09;

public class Ej04_caja {
	private int alto, ancho, profundo;
	
	public Ej04_caja(int alto, int ancho, int profundo){
		this.alto = alto;
		this.ancho = ancho;
		this.profundo = profundo;
	}
	
	public int getVolumen(){
		return this.ancho * this.alto * this.profundo;
	}
	
	public String toString(){
		return "El volumen es: " + getVolumen();
	}
	

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getProfundo() {
		return profundo;
	}

	public void setProfundo(int profundo) {
		this.profundo = profundo;
	}
	
	

}
