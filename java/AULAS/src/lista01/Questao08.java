package lista01;

import java.util.Locale;
import java.util.Scanner;

public class Questao08 {
	
	public static void main(String[] args) {
		//LISTA 01
		//QUEST�O 08
		//. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
		//percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
		//escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
		//consumidor
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double custoFabrica, custoConsumidor;

		System.out.print("Informe o custo de F�brica: ");
		custoFabrica = leia.nextDouble();

		custoConsumidor = custoFabrica + 0.28*custoFabrica + 0.45*custoFabrica; 

		System.out.println("O custo do Consumidor � " + custoConsumidor);
	}

}
