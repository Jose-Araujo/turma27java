package lista05;

public class CadProdutoEletr�nico {

	public static void main(String[] args) {
		//LISTA 05
		//QUETS�O 03
		//Crie uma classe produto eletr�nico e apresente os atributos e m�todos
		//referentes esta classe, em seguida crie um objeto produto eletr�nico,
		//defina as instancias deste objeto e apresente as informa��es deste objeto
		//no console.
		
		ProdutoEletr�nico eletronico1 = new ProdutoEletr�nico();
		
		eletronico1.nomeEletronico = "NOTEBOOK";
		eletronico1.modeloEletronico = "LENOVO";
		eletronico1.ligado = false;
		eletronico1.carregado = true;
		
		System.out.println("CARREGADO: " + eletronico1.carregado );
		System.out.println("LIGADO: " + eletronico1.ligado );
		
		eletronico1.ligar();
		
		System.out.println("CARREGADO: " + eletronico1.ligado );
		System.out.println("LIGADO: " + eletronico1.ligado );
		
		System.out.println("DESCARREGANDO: " + eletronico1.ligado );
		

	}

}
