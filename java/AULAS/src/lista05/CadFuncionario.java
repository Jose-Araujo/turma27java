package lista05;

public class CadFuncionario {

	public static void main(String[] args) {
		//LISTA 05
		//QUESTÃO 04
		//Crie uma classe funcionário e apresente os atributos e métodos
		//referentes esta classe, em seguida crie um objeto funcionário, defina as
		//instancias deste objeto e apresente as informações deste objeto no
		//console.
		
		Funcionario funcionario1 = new Funcionario();
		
		funcionario1.nomeFuncionario = "JV";
		funcionario1.generoFuncionario = "M";
		funcionario1.trabalhando = false;
		funcionario1.idadeFuncionario = 24;
		funcionario1.anosTrabalhados = 10;
		funcionario1.ferias = false;
		
		System.out.println("INFORMAÇÕES FUNCIONÁRIO");
		funcionario1.informacoesFuncionario();
		if(funcionario1.anosTrabalhados > 3) {
			funcionario1.pedirAumento();
		}
		funcionario1.tirarFerias();
		
	}

}
