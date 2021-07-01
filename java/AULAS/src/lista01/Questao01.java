package lista01;

import java.util.Locale;
import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		//LISTA 01
		//QUESTÃO 01: 
		//Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int  idadeUsuarioDias, idadeUsuarioMeses, idadeUsuarioAnos, quantidadeDeDias;
		
		System.out.println("Informe sua idade em anos, meses e dias: ");
		System.out.print("\tAnos: \t");
		idadeUsuarioAnos = leia.nextInt();
		System.out.print("\tMeses: \t");
		idadeUsuarioMeses =leia.nextInt();	
		System.out.print("\tDias: \t");
		idadeUsuarioDias = leia.nextInt();
				
		quantidadeDeDias = 365*idadeUsuarioAnos + 30*idadeUsuarioMeses + idadeUsuarioDias;
		
		System.out.println("\nA idade do usuário em dias é: " + quantidadeDeDias + "\n");
		
	}

}
