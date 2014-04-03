package examen_2014_04_03;

import java.util.Scanner;

public class Ej01_claveSegura {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		boolean segura = true;
		
		System.out.print("Clave: ");
		

		try {
			esClaveSegura(scr.nextLine());
		} catch (Exception e) {
			segura = false;
		}
		
		System.out.printf("Clave %s", segura ? "segura" : "insegura");
		
		scr.close();

	}
	
	public static String esClaveSegura(String clave) throws Exception{
		if(clave.length() >= 6)
			return clave;
		
		throw new Exception("ClaveNoSegura");
	}

}
