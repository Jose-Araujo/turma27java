package lista05;

public class Funcionario {
	//ATRIBUTOS
	public String nomeFuncionario;
	public String generoFuncionario;
	
	public boolean trabalhando;
	public boolean ferias;
	
	public int idadeFuncionario;
	public int anosTrabalhados;
		
	//M�TODOS
	public void informacoesFuncionario() {
		System.out.println("Nome: " + nomeFuncionario);
		System.out.println("Genero: " + generoFuncionario);
		System.out.println("Idade: " + idadeFuncionario);
		System.out.println("Tempo de casa: " + anosTrabalhados);
		System.out.println("Trabalhando: " + trabalhando);
		trabalhar();
		
	}
	
	public void trabalhar() {
		if(trabalhando == false) {
			System.out.println("\nEstou almo�ando!!");
			
		}else {
			System.out.println("\nO que deseja?");
			
		}
		
	}
	
	public void pedirAumento() {
		System.out.println("Quero um aumento!!");
		
	}
	
	public void tirarFerias() {
		if(ferias == true) {
			System.out.println("Voc� vai tirar f�rias no pr�ximo m�s.");
		
		}else {
			System.out.println("Voc� n�o tem f�rias pra tirar.");
			
		}
		
	}
	

}
