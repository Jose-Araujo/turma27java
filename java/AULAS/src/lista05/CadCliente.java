package lista05;

import lista05.Cliente;

public class CadCliente {
	//LISTA 05
	//QUEST�O 01
	/*Crie uma classe cliente e apresente os atributos e m�todos referentes
	esta classe, em seguida crie um objeto cliente, defina as instancias deste
	objeto e apresente as informa��es deste objeto no console.*/

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente();
		
		cliente1.nomeCompletoCliente = "JOS�";
		cliente1.numeroCadastro = "1289";
		cliente1.enderecoCliente = "Itaquaquecetuba";
		cliente1.generoCliente = "Masculino";
		cliente1.estadoCivil = "Solteiro";
		cliente1.anoNascimento = 1997;
		cliente1.cadastroCliente = true;
		
		cliente1.cadastro();

	}

}
