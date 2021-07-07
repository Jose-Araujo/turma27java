package introducao;

import java.util.Scanner;

public class NomeSexoAnoNascimento {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		/*
		NOME
		SEXO: M/F/O
		ANO NASCIMENTO
		OI SR/A/E [NOME], SUA IDADE É XX ANOS!*/
		
		String nomeUsuario, nomeMaior = "", nomeMenor = "";
		char sexoUsuario;
		int anoNascimento, idadeteste;
		int idadeMaior = 0, idadeMenor = 0;
		
		/*
		System.out.print("Informe 0 nome: ");
		nomeUsuario = leia.next().toUpperCase();
		System.out.print("Informe seu sexo [M, F, O]: ");
		sexoUsuario = leia.next().toUpperCase().charAt(0);
		System.out.print("Informe seu ano de nascimento: ");
		anoNascimento = leia.nextInt();
		
		if(sexoUsuario == 'M') {
			System.out.printf("Oi Sr %s, sua idade é %d anos.", nomeUsuario, (2021 - anoNascimento));
		}else if(sexoUsuario == 'F') {
			System.out.printf("Oi Srae %s, sua idade é %d anos.", nomeUsuario, (2021 - anoNascimento));
		}else{
			System.out.printf("Oi Sre %s, sua idade é %d anos.", nomeUsuario, (2021 - anoNascimento));
		}*/
		
		for(int x = 0; x < 2; x++) {
			System.out.print("Informe " + (x + 1) + "º nome: ");
			nomeUsuario = leia.next().toUpperCase();
			System.out.print("Informe seu sexo [M, F, O]: ");
			sexoUsuario = leia.next().toUpperCase().charAt(0);
			System.out.print("Informe seu ano de nascimento: ");
			anoNascimento = leia.nextInt();
			
			if(idadeMaior <= (2021 - anoNascimento )) {
				idadeMaior = (2021 - anoNascimento );
				nomeMaior = nomeUsuario;
				
			}
			
			if(idadeMenor <= idadeMaior) {
				idadeMenor = (2021 - anoNascimento );
				nomeMenor = nomeUsuario;
				
			}
	
			/*
			if(sexoUsuario == 'M') {
				System.out.printf("Oi Sr %s, sua idade é %d anos.", nomeUsuario, (2021 - anoNascimento));
			}else if(sexoUsuario == 'F') {
				System.out.printf("Oi Srae %s, sua idade é %d anos.", nomeUsuario, (2021 - anoNascimento));
			}else{
				System.out.printf("Oi Sre %s, sua idade é %d anos.", nomeUsuario, (2021 - anoNascimento));
			}*/
			
		}
		System.out.printf("Oi Sr(a/e) %s, sua idade é %d anos.\n", nomeMaior, idadeMaior);
		System.out.printf("Oi Sr(a/e) %s, sua idade é %d anos.", nomeMenor, idadeMenor);
		
		

	}

}
