package lista01;

import java.util.Locale;
import java.util.Scanner;

public class Questao08 {
	
	public static void main(String[] args) {
		//LISTA 01
		//QUESTÃO 08
		//. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
		//percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
		//escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
		//consumidor
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double custoFabrica, custoConsumidor;

		System.out.print("Informe o custo de Fábrica: ");
		custoFabrica = leia.nextDouble();

		custoConsumidor = custoFabrica + 0.28*custoFabrica + 0.45*custoFabrica; 

		System.out.println("O custo do Consumidor é " + custoConsumidor);
	}

}
