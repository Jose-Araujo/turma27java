package programas;

import java.util.Scanner;

import objetos.Pessoa;

public class CadAluno {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Pessoa aluno = new Pessoa();
		
		System.out.print("NOME: ");
		aluno.nome = leia.next().toUpperCase();
		System.out.print("ANO DE NASCIMENTO: ");
		aluno.anoNascimento = leia.nextInt();
		
		if(aluno.calcularIdade(2021) < 16 && aluno.calcularIdade(2021) > 0) {
			System.out.printf("Oi aluno/a/e, voc� tem %d anos e � do Ensino Fundamental.", aluno.calcularIdade(2021));
			
		}else if(aluno.calcularIdade(2021) >= 16 && aluno.calcularIdade(2021) < 21) {
			System.out.printf("Oi aluno/a/e, voc� tem %d anos e � do Ensino M�dio.", aluno.calcularIdade(2021));
			
		}else if(aluno.calcularIdade(2021) >= 21){
			System.out.printf("Oi aluno/a/e, voc� tem %d anos e � do Ensino Superior.", aluno.calcularIdade(2021));
			
		}else {
			System.out.println("Nem Nasceu!!");
		}
	}

}
