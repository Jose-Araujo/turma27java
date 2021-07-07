package lista05;

public class Cliente {
	
	//ATRIBUTOS
	public String nomeCompletoCliente;
	public String numeroCadastro;
	public String enderecoCliente; 
	public String generoCliente; 
	public String estadoCivil;
	
	public int anoNascimento, idadeCliente;
	
	public boolean cadastroCliente;

	//MÉTODOS
	public void informacoesCliente() {
		System.out.println("NOME: " + nomeCompletoCliente);
		System.out.println("Nº CADASTRO: " + numeroCadastro);
		System.out.println("ENDEREÇO: " + enderecoCliente);
		System.out.println("GENERO: " + generoCliente);
		System.out.println("ESTADO CIVIL: " + estadoCivil);
		System.out.println("IDADE: " + idadeCliente);
		
	}
	
	public void cadastro() {
		if(cadastroCliente == true) {
			idade();
			informacoesCliente();

		}else {
			System.out.println("CLIENTE NÃO CADASTRADO!!");
			cadastroNovoCliente();
			
		}
	}
	
	public void idade() {
		idadeCliente = 2021 - anoNascimento;
		
	}
	
	public void cadastroNovoCliente() {
		System.out.println("Se cadastrando na loja você ganha 20% de desconto em suas compras!!");
	
	}
	
	
}
