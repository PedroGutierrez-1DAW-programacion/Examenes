package examen_2014_04_10;

import java.util.Scanner;

public class Ej03_pruebaPelicula {
	
	private static Scanner scn;

	public static void main(String[] args) {
		
		
		try {
			// Controlamos el error, por controlar alguno...
			scn = new Scanner(System.in);
		} catch (Exception e) {
			System.err.printf("Error al abrir Scanner [%s]", e.getMessage());
		}
		
		Ej03_cine cine = iniciarCine();
		
		while(true){
			switch(mostrarMenu()){
				case 1: cine = nuevaPelicula(cine); break;
				case 2: cine = borrarPelicula(cine); break;
				case 3: listaPelicula(cine); break;
				case 4: listaPeliculaInfo(cine); break;
				default: System.err.println("Opción no válida\n"); break;
			}
		}

	}
	
	private static Ej03_cine nuevaPelicula(Ej03_cine cine) {
		Ej03_pelicula peliNueva;
		boolean finGenero = false;

		System.out.println(genTituloMenu("Añadir"));
		System.out.printf("Cine: %s\n", cine.getNombre());
		System.out.println("--------------------");
		
		peliNueva = new Ej03_pelicula(pedirDatoString("Nombre"));
		
		try {
			cine.addPelicula(peliNueva);
		} catch (Exception e) {
			System.out.println("--------------------\n");
			System.err.printf("Error [%s]\n\n", e.getMessage());
			
			return cine;
		}
		
		while(!finGenero){
			try {
				if(finGenero) continue;
				String genero = pedirDatoString("Género");
				
				if(genero.equals("")){
					finGenero = true;
					continue;
				}
				
				peliNueva.setGeneros(genero);
			} catch (Exception e) {
				finGenero = true;
				System.err.printf("Error [%s]\n\n", e.getMessage());
			}
		}
		
		System.out.println("--------------------\n");
		
		return cine;
	}

	private static Ej03_cine borrarPelicula(Ej03_cine cine) {
		String eliminar;
		
		System.out.println(genTituloMenu("Eliminar"));
		System.out.printf("Cine: %s\n", cine.getNombre());
		System.out.println("--------------------");
		
		eliminar = pedirDatoString("Eliminar");

		System.out.println("--------------------\n");
		
		try {
			cine.delPelicula(eliminar);
		} catch (Exception e) {
			System.err.printf("Error [%s]\n\n", e.getMessage());
		}	
		
		return cine;
	}

	private static void listaPelicula(Ej03_cine cine) {
		System.out.println(genTituloMenu("Peliculas"));
		System.out.printf("Cine: %s\n", cine.getNombre());
		System.out.println("--------------------");
		
		for(Ej03_pelicula peli : cine.getPeliculas())
			System.out.println(peli.getNombre());

		System.out.println("--------------------\n");
		
	}

	private static void listaPeliculaInfo(Ej03_cine cine) {
		System.out.println(genTituloMenu("Peliculas"));
		System.out.printf("Cine: %s\n", cine.getNombre());
		System.out.println("--------------------");
		
		for(Ej03_pelicula peli : cine.getPeliculas())
			System.out.println(peli);

		System.out.println("--------------------\n");
		
	}

	private static int mostrarMenu(){

		int n = 0;
		int r = -1;
		String[] listaDatos = new String[]{"Nueva película", "Borrar película", "Ver películas", "Ver películas +"};
		
		System.out.println(genTituloMenu("MenuCine"));
		
		
		for(String dato : listaDatos)
			System.out.printf("[%d] %16s\n", ++n, dato);
		
		r = pedirDato("--------------------");

		System.out.println("--------------------\n");
			
		return r;
	}
	
	private static String genTituloMenu(String titulo) {
		return String.format("--[%s]%s", titulo, "--------------------".substring(titulo.length() + 4));
	}

	private static int pedirDato(String nombre) {
		String dato = "-1";
		
		System.out.println(nombre);
		
		do System.out.print("  => ");
		while(!(new String(dato = scn.nextLine())).matches("[0-9]{1,3}"));
		
		return new Integer(dato);
	}
	
	private static String pedirDatoString(String nombre) {
		String dato = "-";
		
		System.out.println(nombre);
		
		do System.out.print("  => ");
		while(!(new String(dato = scn.nextLine())).matches("[a-zA-Z0-9 áéíóúÁÉÍÓÚäëïöüÄËÏÖÜ]{0,30}"));
		
		return dato;
	}
	
	private static Ej03_cine iniciarCine(){
		// Peliculas de prueba
		Ej03_pelicula p1 = new Ej03_pelicula("Diciembre");
		Ej03_pelicula p2 = new Ej03_pelicula("La luna");
		Ej03_pelicula p3 = new Ej03_pelicula("Elysium");

		try {
			// Si se añade más de 6 géneros salta el error
			p1.setGeneros("Alguno1");
			p1.setGeneros("Alguno2");
			p1.setGeneros("Alguno3");
			p1.setGeneros("Alguno4");
			p1.setGeneros("Alguno5");
			p1.setGeneros("Alguno6");

			p2.setGeneros("Genero");
			p2.setGeneros("Generado");
			p2.setGeneros("General");

			p3.setGeneros("Ciencia ficción");
			p3.setGeneros("Acción");
		} catch (Exception e) {
			System.err.printf("Error [%s]\n", e.getMessage());
		}
		
		Ej03_cine cine = new Ej03_cine("Cinesa", 5);

		try{
			cine.addPelicula(p1);
			cine.addPelicula(p2);
			cine.addPelicula(p3);
		} catch (Exception e) {
			System.err.printf("Error [%s]\n", e.getMessage());
		}
		
		return cine;
	}

}
