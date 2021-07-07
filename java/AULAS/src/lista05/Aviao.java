package lista05;

public class Aviao {

	//ATRIBUTOS 	
	public String modelo;
	public String tipo;
	
	public int rodas;
	public int velocidade;

	public boolean noAr;
	public boolean ligado;
	
	//MÉTODOS
	public void ligar() {
		ligado = true;
		
	}
	
	public void desligar() {
		ligado = false;
		
	}
	
	public void decolar() {
		for(int x = 1; x <= 10; x++) {
			aumentarVelocidade();
		}

		noAr = true;
		
	}
	
	public void pousar() {
		for(int x = 1; x <=10; x++) {
			diminuirVelocidade();
		}
		noAr = false;
		
	}
	
	public void aumentarVelocidade() {
		velocidade++;
		
	}
	
	public void aumentarVelocidade(int acrescimo) {
		velocidade += acrescimo;
		
	}
	
	public void diminuirVelocidade() {
		velocidade--;
		
	}
	
	public void diminuirVelocidade(int decrescimo) {
		velocidade -= decrescimo;
		
	}
	
}
