package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;
import entities.Terceiro;

public class TesteCad {

	public static void main(String[] args) {
/*
		Funcionario func1 = new Funcionario("001", 40, 10.00);
		Terceiro ter1 = new Terceiro("100", 40, 10.00, 50);
		Horista novo = new Horista("111.111.111-11", 10, 10);
		
		System.out.println("CPF horista: " + novo.getCpf());
		System.out.println(novo.getHoras());
		
		System.out.println("FUNCION�RIO CLT");
		System.out.println("Matr�cula: " + func1.getMatricula());
		System.out.println("Sal�rio Atual: R$" + func1.salario());
		
		
		System.out.println("FUNCION�RIO TERCEIRO");
		System.out.println("Matr�cula: " + ter1.getMatricula());
		System.out.println("Sal�rio Atual: R$" + ter1.salario());
		System.out.println("Extra maluca: R$");
*/
		Scanner leia = new Scanner(System.in);
		
		List <Funcionario> lista = new ArrayList<>();
		int numero;
		
		System.out.println("CADASTRO DE FUNCIONARIOS");
		System.out.print("Digite a quantidade de funcion�rios a serem cadastrados:");
		numero = leia.nextInt();
		
		for(int x = 0; x < numero; x++) {
			System.out.println("Funcionario: ");
			System.out.println("Funcionario terceiro S/N: ?");
			char op = leia.next().toUpperCase().charAt(0);
			System.out.println("Digite a matr�cula do funcionario: ");
			String matricula = leia.next();
			System.out.println("Digite as horas trabalhadas: ");
			int horasTrabalhadas = leia.nextInt();
			System.out.println("Digite o valor por hora trabalhada: ");
			double valorHora = leia.nextDouble();
			
			if(op == 'S') {
				System.out.println("Digite o valor do adicional: R$ ");
				double adicional = leia.nextDouble();
				lista.add(new Terceiro(matricula, horasTrabalhadas, valorHora, adicional));
			}else if (op == 'N'){
				lista.add(new Funcionario(matricula, horasTrabalhadas, valorHora));
			}else {
				System.out.println("ENTRADA INV�LIDA!!");
			}
		}
		System.out.println();
		System.out.println("FOLHA DE PAGAMENTO");
		
		for(Funcionario emp: lista) {
			System.out.println("Matr�cula do colaborador: " + emp.getMatricula() + " salario R$ " + emp.salario());
		}
		
	}

}
