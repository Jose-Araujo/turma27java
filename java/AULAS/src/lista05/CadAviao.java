package lista05;

public class CadAviao {

	public static void main(String[] args) {
		//LISTA05
		//QUEST�O 02
		/*Crie uma classe avi�o e apresente os atributos e m�todos referentes
		esta classe, em seguida crie um objeto avi�o, defina as instancias deste
		objeto e apresente as informa��es deste objeto no console.*/

		Aviao aviao1 = new Aviao();
		
		aviao1.modelo = "BIMOTOR";
		aviao1.rodas = 3;
		aviao1.tipo = "PASSAGEIROS 14 LUGARES";
		aviao1.noAr = false;
		aviao1.ligado = false;
		aviao1.velocidade = 0;
		
		//Colocando o avi�o para voar
		System.out.println("SITUA��O DO AVI�O...");
		System.out.println("Veloc�metro atual: " + aviao1.velocidade + " No Ar " + aviao1.noAr + " LIGADO " + aviao1.ligado);
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
		System.out.println("Veloc�metro atual: " + aviao1.velocidade + " No Ar " + aviao1.noAr + " LIGADO " + aviao1.ligado);
		
		//Colocando o avi�o no ch�o
		aviao1.diminuirVelocidade(40);
		System.out.println("Veloc�metro atual: " + aviao1.velocidade + " No Ar " + aviao1.noAr + " LIGADO " + aviao1.ligado);
		aviao1.pousar();
		System.out.println("Veloc�metro atual: " + aviao1.velocidade + " No Ar " + aviao1.noAr + " LIGADO " + aviao1.ligado);
		aviao1.desligar();
		System.out.println("Veloc�metro atual: " + aviao1.velocidade + " No Ar " + aviao1.noAr + " LIGADO " + aviao1.ligado);
		
		
		//Avi�o parado
		
			
	}

}
