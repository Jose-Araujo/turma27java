package introducao;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;


public class CadAluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		//String alunos[] = new String[4]; // 0 --> 3
		String alunos[] = {"JOÃO", "MARCOS", "MARIA", "PEDRO"};
		String matricula[] = new String[4];
 		String nome;
		int notas[] = new int[4];
		String auxiliar;
		
		final int LIMITE = 4;
		System.out.println("Cadastro de notas");
		
		for (int x = 0; x < alunos.length; x++) {
			System.out.println("Aluno " + (x + 1));
			matricula[x] = "MAT-" + (x + 1);
			System.out.print("Matricula " + matricula[x] + " aluno " + alunos[x].toUpperCase() + ": ");
			notas[x] = leia.nextInt();		 	
			
		}
		
		System.out.println("BOLETIM");
		for(int x = 0; x < LIMITE; x++) {
			if(notas[x] >= 5) {
				System.out.printf("%s - %s nota : %d APROVADO \n", matricula[x],  alunos[x].toUpperCase(), notas[x]);
		
			}else{
				System.out.printf("%s - %s nota : %d REPROVADO \n", matricula[x],  alunos[x].toUpperCase(), notas[x]);
				
			}
			
		}
		
		System.out.println("Escolha o aluno que deseja pesquisar a nota pela matrícula");
		System.out.println("Digite a matricula: ");
		auxiliar = leia.next().toUpperCase();
		
		for(int x = 0; x < LIMITE; x++) {
			if(matricula[x].equals(auxiliar)) {
				if(notas[x] >= 5) {
					System.out.printf("%s - %s nota : %d APROVADO \n", matricula[x],  alunos[x].toUpperCase(), notas[x]);
		
				}else{
					System.out.printf("%s - %s nota : %d REPROVADO \n", matricula[x],  alunos[x].toUpperCase(), notas[x]);
				
			}
				
			}
			
		}
		
		/*System.out.println(alunos[2].toLowerCase());
		
		for (int x = 0; x < 4; x++) {
			System.out.println(alunos[x]);
			
		}
		*/
		
		/*
		for (String x : alunos) {
			System.out.println(x);
			
		}
		
		
		System.out.println("Digite o nome completo: ");
		nome = leia.nextLine();
		
		if(nome.length() > 25) {
			System.out.println("Que nome grande é esse!!!");
		
		}else {
			System.out.println("Nome com tamanho normal!!!");
		}
		*/
	}

}
