package examen_2014_06_09;

public class Ej04_paquete extends Ej04_caja implements Ej04_inter_postal{
	private int peso;
	private double costeEnvio;
	private boolean entregado = false;
	private String direccion;
	
	public static void main(String[] args) {
		Ej04_paquete paquete = new Ej04_paquete(20, 10, 23, 218, 1.2);
		
		paquete.enviar("Calle vieja 123, Toledo");
		
		System.out.println(paquete);
	}

	public Ej04_paquete(int alto, int ancho, int profundo, int peso, double coste) {
		super(alto, ancho, profundo);
		
		this.peso = peso;
		setCosteEnvio(coste);
	}
	
	public String toString(){
		String datos = "";
		
		datos += "Dirección: " + this.direccion;
		datos += "\nPortes: " + portes();
		datos += "\nEntregado: " + (entregado() ? "Si" : "No");
		datos += "\nPeso: " + this.peso;
		datos += "\n" + super.toString();
		
		return datos;
	}

	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public double getCosteEnvio() {
		return costeEnvio;
	}
	public void setCosteEnvio(double costeEnvio) {
		this.costeEnvio = costeEnvio >= getCosteMinimo() ? costeEnvio : getCosteMinimo();
	}

	public boolean isEntregado() {
		return entregado;
	}
	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	@Override
	public double getCosteMinimo() {
		return 2.30;
	}

	@Override
	public void enviar(String direccion) {
		this.direccion = direccion;
		this.entregado = true;		
	}

	@Override
	public boolean entregado() {
		return this.entregado;
	}

	@Override
	public double portes() {
		return getCosteEnvio();
	}
	
	
	

}
