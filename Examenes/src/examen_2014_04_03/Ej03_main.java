package examen_2014_04_03;

public class Ej03_main {

	public static void main(String[] args) {
		
		Ej03_matrizDispersa m1, m2;
		
		m1 = new Ej03_matrizDispersa(3, 5, 0.2);
		m2 = new Ej03_matrizDispersa(new int[5][3], 0.4);
		
		System.out.println(m1);
		
		System.out.println("----------------\n");
		
		System.out.println(m2);
		
		System.out.println("----------------\n");

		m2 = meterValor(m2, 2, 2, 3.3);
		m2 = meterValor(m2, 10, 3, 3.3);
		m2 = meterValor(m2, 4, 3, 3.3);
		m2 = meterValor(m2, 0, 0, 3.3);
		m2 = meterValor(m2, 1, 0, 3.3);
		
		System.err.println();
		
		System.out.println(m2);

	}
	
	private static Ej03_matrizDispersa meterValor(Ej03_matrizDispersa matriz, int x, int y, double valor){
		try {
			matriz.setValor(x, y, valor);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		return matriz;
	}

}
