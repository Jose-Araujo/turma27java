package objetos;

public class Pessoa {
	
	//##########################################Criando Atributos#############################################
	public String nome;
	public char sexo;
	public int anoNascimento;
	
	//##########################################Criando Atributos#############################################
	
	//##########################################Criando Métodos#############################################
	public void mostrarIdade() {
		System.out.println(2021 - anoNascimento);
		if(2021 - anoNascimento >= 18) {
			System.out.println("Você é adulto!");
			
		}else {
			System.out.println("Você é criança!");
		}
	}
	
	public int calcularIdade() {
		return 2021 - anoNascimento;
		
	}
	
	public int calcularIdade(int anoAtual) {
		return anoAtual - anoNascimento;
		
	}
	
	//##########################################Criando Métodos################################################
}
