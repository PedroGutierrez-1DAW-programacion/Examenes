package examen_2014_04_03;

public class Ej02_matrizDispersa {
	
	private double[][] matriz;
	
	private Ej02_matrizDispersa(int tamanio, double dispersos){
		this.matriz = new double[tamanio][tamanio];
		generarDispersos(tamanio * tamanio, dispersos);
	}

	public static void main(String[] args) {
		
		Ej02_matrizDispersa md = new Ej02_matrizDispersa(4, 0.5);
		System.out.println(md);

	}
	
	public String toString(){
		String ver = "";
		double redondeo = 10.0;
		
		for(int x=0; x<matriz.length; x++){
			for(int y=0; y<matriz[x].length; y++)
				ver += (Math.round(this.matriz[x][y] * redondeo) / redondeo) + " ";
			ver += "\n";
		}
		
		return ver;
	}

	private void generarDispersos(int tamanio, double dispersos) {
		if(dispersos >= 1)
			dispersos = 1.0;
		
		for(int i=0; i<(tamanio * dispersos); i++){
			int x = (int) (Math.random() * matriz.length);
			int y = (int) (Math.random() * matriz[x].length);
			
			if(matriz[x][y] == 0){
				matriz[x][y] = Math.random() * 10.0;
			}else{
				i--;
			}
		}
		
	}

}
