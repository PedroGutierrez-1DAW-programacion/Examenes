package examen_2014_06_09;

public class Ej03_parDeDados {
	private Ej03_dado dado1, dado2;

	public static void main(String[] args) {
		Ej03_parDeDados dados = new Ej03_parDeDados();
		int contador = 0;
		boolean parejaUno = false;
		
		while(!parejaUno){
			dados.tirar();
			System.out.println("Tirada de dados, ha salido "  + dados);
			
			if(dados.getValor() == 2) parejaUno = true;
			
			contador++;
		}
		
		System.out.printf("\nMe llevó %d tiradas conseguir dos unos.", contador);
	}
	
	public Ej03_parDeDados(){
		this.dado1 = new Ej03_dado();
		this.dado2 = new Ej03_dado();
	}
	
	public void tirar(){
		dado1.tirar();
		dado2.tirar();
	}
	
	public String toString(){
		return getDado1() + " y " + getDado2() + " son " + getValor();
	}
	
	public int getValor(){
		return getDado1() + getDado2();
	}

	public int getDado1() {
		return dado1.getValor();
	}
	public int getDado2() {
		return dado2.getValor();
	}

}
