package lista05;

public class ProdutoEletr�nico {
	//ATRIBUTOS
	public String nomeEletronico;
	public String modeloEletronico;
	
	public boolean carregado;
	public boolean ligado;
	
	private int bateria;
	
	//M�TODOS
	public void ligar() {
		if(carregado == true) {
			ligado = true;
			descarregar();
		}else {
			carregar();
		}
		
	}
	
	public void desligar() {
		ligado = false;
		
	}
	
	public void carregar() {
		if(carregado == false) {
			System.out.println("Bateria 0%. CARREGANDO...");
			System.out.println("Bateria 100%. CARREGADO.");
			carregado = true;
			ligar();
			
		}else {
			ligar();
			
		}
		
	}
	
	public void descarregar() {
		if(carregado == true) {
			System.out.println("Bateria 100%. DESCARREGANDO...");
			carregado = false;
			
		}else {
			desligar();
			
		}
		
	}	


}
