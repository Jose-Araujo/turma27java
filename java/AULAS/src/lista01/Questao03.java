package lista01;

import java.util.Locale;
import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		//LISTA 01
		//QUESTÃO 03:
		//Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int tempoDeDuracaoEvento, duracaoEventoSegundos, duracaoEventoMinutos, duracaoEventoHoras; 

		System.out.print("Digite a duração do evento em segundos: ");
		tempoDeDuracaoEvento = leia.nextInt();

		duracaoEventoHoras = tempoDeDuracaoEvento/3600;
		duracaoEventoMinutos = (tempoDeDuracaoEvento%3600)/60;
		duracaoEventoSegundos = (tempoDeDuracaoEvento%3600)%60;
		
		System.out.println("\nA duração do evento em horas, minutos e segundos é: ");
		System.out.println("\tHoras:\t\t" + duracaoEventoHoras);
		System.out.println("\tMinutos:\t" + duracaoEventoMinutos);
		System.out.println("\tSegundos:\t" + duracaoEventoSegundos);

	}

}
