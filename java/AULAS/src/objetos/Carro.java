package objetos;

public class Carro {
	//ATRIBUTOS
	public String modeloCarro, placaCarro;
	public boolean carroAutomatico, carroManual, ligado;
	public int anoModelo, quantidadePortas, velocidade; 
	
	//MÉTODOS
	public void ligarCarro() {
		ligado = true;
		System.out.println("Carro ligando...");
		
	}
	
	public void desligarCarro() {
		if(velocidade == 0) {
			ligado = false;
			System.out.println("Carro desligando...");
			
		}else {
			System.out.println("Desacelere o carro!");
			
		}
		
	}
	
	public void acelerar() {
		velocidade++;
		
	}
	
	public void desacelerar() {
		velocidade--;
	}
	
	
	
}
