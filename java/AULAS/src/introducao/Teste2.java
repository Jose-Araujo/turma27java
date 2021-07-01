package introducao;

import java.util.Locale;
import java.util.Scanner;

public class Teste2 {

	public static void main(String[] args) {
		/*
		//interio anoNascimento
		int anoNascimento = 1997;			//int --> %d
		//cadeia nome = "EPAMINONDAS"		
		String nome = "EPAMINONDAS";		//String --> %s
		char sexo2 = 'M';					//char --> %c
		double salario = 1000.5555588888; 	//double --> %f
		
		//System.out.println(nome);
		//System.out.println("Sua idade é: " + (2021 - anoNascimento));


		System.out.println(nome + " o seu salário é R$ " + (int)salario); //Converter para inteiro
		System.out.println(nome + " o seu salário é R$ " + salario);
		System.out.printf("%s o seu salário é %.2f.", nome, salario);
		*/
		Locale.setDefault(Locale.US); //recurso avançado
		Scanner leia = new Scanner(System.in);
		
		int anoNascimento;
		double salarioUsuario;
		String nomeUsuario;
		
		System.out.println("Digite o nome: ");	//escreva("Dgite o nome: ")
		//nomeUsuario = leia.next();			//leia(nome)
		nomeUsuario = leia.next().toUpperCase();	//lê nome e deixa tudo em maiúsculo
		System.out.println("Digite o ano de nascimento: ");
		anoNascimento = leia.nextInt();
		System.out.println("Digite o salário: ");
		salarioUsuario = leia.nextDouble();
		
		System.out.printf("Oi %s, sua idade é %d e seu salário é %.2f.", nomeUsuario, (2021 - anoNascimento), salarioUsuario);

	}

}
