package lista02;

import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Questao04 {

	public static void main(String[] args) {
		//LISTA 02
		//QUEST�O 04
		//Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
		//n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
		//�mpar exiba o n�mero elevado ao quadrado.
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double entradaNumero;
		
		System.out.println("Entre com um valor: ");
		entradaNumero = leia.nextDouble();
		
		if(entradaNumero%2 == 0) {
			System.out.println("O n�mero " + entradaNumero + " � par.");
			System.out.println("Sua ra�z quadrada � " + new DecimalFormat("0.000").format(Math.sqrt(entradaNumero)) + ".");
			
		}else {
			System.out.println("O n�mero " + entradaNumero + " � �mpar.");
			System.out.println("Sua ra�z quadrada � " +  new DecimalFormat("0.000").format(Math.pow(entradaNumero, 2)) + ".");
		}

	}

}
