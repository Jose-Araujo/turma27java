package lista05;

public class Funcionario {
	//ATRIBUTOS
	public String nomeFuncionario;
	public String generoFuncionario;
	
	public boolean trabalhando;
	public boolean ferias;
	
	public int idadeFuncionario;
	public int anosTrabalhados;
		
	//MÉTODOS
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
			System.out.println("\nEstou almoçando!!");
			
		}else {
			System.out.println("\nO que deseja?");
			
		}
		
	}
	
	public void pedirAumento() {
		System.out.println("Quero um aumento!!");
		
	}
	
	public void tirarFerias() {
		if(ferias == true) {
			System.out.println("Você vai tirar férias no próximo mês.");
		
		}else {
			System.out.println("Você não tem férias pra tirar.");
			
		}
		
	}
	

}
