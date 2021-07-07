package lista05;

public class CadAviao {

	public static void main(String[] args) {
		//LISTA05
		//QUESTÃO 02
		/*Crie uma classe avião e apresente os atributos e métodos referentes
		esta classe, em seguida crie um objeto avião, defina as instancias deste
		objeto e apresente as informações deste objeto no console.*/

		Aviao aviao1 = new Aviao();
		
		aviao1.modelo = "BIMOTOR";
		aviao1.rodas = 3;
		aviao1.tipo = "PASSAGEIROS 14 LUGARES";
		aviao1.noAr = false;
		aviao1.ligado = false;
		aviao1.velocidade = 0;
		
		//Colocando o avião para voar
		System.out.println("SITUAÇÃO DO AVIÃO...");
		System.out.println("Velocímetro atual: " + aviao1.velocidade + " No Ar " + aviao1.noAr + " LIGADO " + aviao1.ligado);
		System.out.println("Vamos pra pista!!!!");
		
		aviao1.ligar();
		aviao1.aumentarVelocidade();
		aviao1.aumentarVelocidade();
		aviao1.aumentarVelocidade();
		aviao1.diminuirVelocidade();
		aviao1.diminuirVelocidade();
		aviao1.diminuirVelocidade();
		aviao1.decolar();
		aviao1.aumentarVelocidade(40);
		System.out.println("Velocímetro atual: " + aviao1.velocidade + " No Ar " + aviao1.noAr + " LIGADO " + aviao1.ligado);
		
		//Colocando o avião no chão
		aviao1.diminuirVelocidade(40);
		System.out.println("Velocímetro atual: " + aviao1.velocidade + " No Ar " + aviao1.noAr + " LIGADO " + aviao1.ligado);
		aviao1.pousar();
		System.out.println("Velocímetro atual: " + aviao1.velocidade + " No Ar " + aviao1.noAr + " LIGADO " + aviao1.ligado);
		aviao1.desligar();
		System.out.println("Velocímetro atual: " + aviao1.velocidade + " No Ar " + aviao1.noAr + " LIGADO " + aviao1.ligado);
		
		
		//Avião parado
		
			
	}

}
