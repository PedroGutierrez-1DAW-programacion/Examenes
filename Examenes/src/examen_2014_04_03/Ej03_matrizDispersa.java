package examen_2014_04_03;

import java.util.Vector;

public class Ej03_matrizDispersa {
	private Vector<Ej03_elementoMatriz> elementos = new Vector<Ej03_elementoMatriz>();
	private int sx, sy;
	
	public Ej03_matrizDispersa(int sx, int sy, double dispersos){
		this.sx = sx;
		this.sy = sy;
		generarDispersos(dispersos);
	}
	
	public Ej03_matrizDispersa(int[][] array, double dispersos){
		this.sx = array.length;
		this.sy = array[0].length;
		generarDispersos(dispersos);
	}
	
	public void setValor(int x, int y, double valor) throws Exception{
		
		if(this.sx <= x || this.sy <= y)
			throw new Exception("FueraDeRango["+x+","+y+"]");
		
		boolean reescrito = false;
		
		for(int i=0; i<elementos.size(); i++)
			if(elementos.elementAt(i).enIgualPosicion(x, y)){
				elementos.elementAt(i).setValor(valor);
				reescrito = true;
				break;
			}
		
		if(!reescrito)
			elementos.add(new Ej03_elementoMatriz(x, y, valor));
	}

	private void generarDispersos(double dispersos) {
		if(dispersos >= 1)
			dispersos = 1.0;
		
		for(int i=0; i<((this.sx * this.sy) * dispersos); i++){
			int x = (int) (Math.random() * this.sx);
			int y = (int) (Math.random() * this.sy);
			
			if(sinIguales(x, y)){
				elementos.add(new Ej03_elementoMatriz(x, y, Math.random() * 10.0));
			}else{
				i--;
			}
		}
	}

	private boolean sinIguales(int x, int y) {
		for(int i=0; i<elementos.size(); i++)
			if(elementos.elementAt(i).enIgualPosicion(x, y))
				return false;
		return true;
	}
	
	public String toString(){
		String ver = "";
		
		for(int y=0; y<sy; y++){
			for(int x=0; x<sx; x++)
				ver += valorEn(x, y) + " ";
			ver += "\n";
		}
		
		return ver;
	}

	private double valorEn(int x, int y) {
		for(int i=0; i<elementos.size(); i++)
			if(elementos.elementAt(i).enIgualPosicion(x, y))
				return elementos.elementAt(i).getValor();
		return 0.0;
	}
}
