package lista05;

public class CadProdutoEletrônico {

	public static void main(String[] args) {
		//LISTA 05
		//QUETSÃO 03
		//Crie uma classe produto eletrônico e apresente os atributos e métodos
		//referentes esta classe, em seguida crie um objeto produto eletrônico,
		//defina as instancias deste objeto e apresente as informações deste objeto
		//no console.
		
		ProdutoEletrônico eletronico1 = new ProdutoEletrônico();
		
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
