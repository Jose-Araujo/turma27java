package lista01;

import java.util.Locale;
import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		//LISTA 01
		//QUESTÃO 02:
		//Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int idadeDoUsuarioDias, idadeUsuarioDias, idadeUsuarioMeses, idadeUsuarioAnos;

		System.out.print("Digite a idade do usuário em dias: ");
		idadeDoUsuarioDias = leia.nextInt();
		
		idadeUsuarioAnos = idadeDoUsuarioDias/365;
		idadeUsuarioMeses = (idadeDoUsuarioDias%365)/30;
		idadeUsuarioDias = (idadeDoUsuarioDias%365)%30;

		System.out.println("\nA idade do usuário em anos, meses e dias é:");
		System.out.println("\tAnos: \t" + idadeUsuarioAnos);
		System.out.println("\tMeses: \t" + idadeUsuarioMeses);
		System.out.println("\tDias: \t" + idadeUsuarioDias);
		
	}

}
