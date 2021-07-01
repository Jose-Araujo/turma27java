package lista01;

import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Questao06 {

	public static void main(String[] args) {
		//LISTA 01
		//QUEST�O 06:
		//Construa um programa em c que, tendo como dados de entrada dois 
		//pontos quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a dist�ncia entre eles. 
		//A f�rmula que efetua tal c�lculo �: d = sqrt((x2-x1)^2 + (y2 - y1)^2)
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double pontoX1, pontoX2, pontoY1, pontoY2, distanciaEntrePontos;

		System.out.println("Digite as coordenadass do primeiro ponto!");
		System.out.print("Coordenada X: ");
		pontoX1 = leia.nextDouble();
		System.out.print("Coordenada Y: ");
		pontoY1 = leia.nextDouble();
		System.out.println("Digite as coordenadass do segundo ponto");
		System.out.print("Coordenada X: ");
		pontoX2 = leia.nextDouble();
		System.out.print("Coordenada Y: ");
		pontoY2 = leia.nextDouble();

		distanciaEntrePontos = Math.sqrt(Math.pow(pontoX2 - pontoX1, 2) + Math.pow(pontoY2 - pontoY1, 2));

		System.out.println("\nA distancia entre os pontos � " + new DecimalFormat("0.000").format(distanciaEntrePontos));
		//System.out.printf("\nA distancia entre os pontos � %.3f", distanciaEntrePontos);

	}

}
