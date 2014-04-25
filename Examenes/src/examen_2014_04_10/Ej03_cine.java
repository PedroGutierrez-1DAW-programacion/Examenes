package examen_2014_04_10;

import java.util.Vector;

public class Ej03_cine {
	
	private String nombre;
	private int maxPeliculas;
	private Vector<Ej03_pelicula> peliculas = new Vector<Ej03_pelicula>();
	
	public Ej03_cine(String nombre, int peliculas){
		this.nombre = nombre;
		this.maxPeliculas = peliculas;
	}

	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Ej03_pelicula[] getPeliculas(){
		return this.peliculas.toArray(new Ej03_pelicula[this.peliculas.size()]);
	}
	
	public void addPelicula(Ej03_pelicula pelicula) throws Exception{
		if(this.peliculas.size() >= this.maxPeliculas)
			throw new Exception("Número máximo de peliculas: " + maxPeliculas);
		
		this.peliculas.add(pelicula);
	}
	
	public void delPelicula(String nombre) throws Exception{
		boolean eliminada = false;
		
		for(int i=0; i<this.peliculas.size() && !eliminada; i++)			
			if(nombre.equalsIgnoreCase(this.peliculas.elementAt(i).getNombre())){
				this.peliculas.removeElementAt(i);
				eliminada = true;
			}
		
		if(!eliminada)
			throw new Exception("Película no encontrada");
	}
}
