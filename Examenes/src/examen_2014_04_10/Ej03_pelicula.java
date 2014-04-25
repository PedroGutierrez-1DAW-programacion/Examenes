package examen_2014_04_10;

import java.util.Vector;

public class Ej03_pelicula {
	
	private String nombre;
	private Vector<String> generos = new Vector<String>();
	
	public Ej03_pelicula(String nombre){
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Vector<String> getGeneros() {
		return generos;
	}

	public void setGeneros(String genero) throws Exception {
		if(generos.size() >= 6)
			throw new Exception("Número máximo de géneros: 6");
			
		this.generos.add(genero);
	}
	
	public String toString(){
		String resp = "";
		
		resp += this.nombre;
		resp += " (";
		
		for(int i=0; i<this.generos.size(); i++)
			resp += String.format("%s%s", i!=0 ? ", " : "", this.generos.elementAt(i));
		
		resp += ")";
		
		return resp;
	}
	
	
}
