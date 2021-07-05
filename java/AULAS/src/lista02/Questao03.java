package lista02;

import java.util.Locale;
import java.util.Scanner;

public class Questao03 {
	
	public static void main(String[] args) {
		//LISTA 02
		//QUESTÃO 03
		//Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra: 
		//10-14 infantil 
		//15-17 juvenil
		//18-25 adulto
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int idadeUsuario;
		
		System.out.print("Informe a idade: ");
		idadeUsuario = leia.nextInt();
		
		if(idadeUsuario >= 10 && idadeUsuario <= 14) {
			System.out.println("Infantil");
			
		}else if(idadeUsuario >= 15 && idadeUsuario <= 17){
			System.out.println("Jovem");
			
		}else if(idadeUsuario >= 18 && idadeUsuario <= 25){
			System.out.println("Adulto");
			
		}else {
			System.out.println("Não categorizado");
		}
		
}

}
