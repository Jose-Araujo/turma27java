package lista01;

import java.util.Locale;
import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		//LISTA 01
		//QUEST�O 05:
		//Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. 
		//Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente.
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double nota01Aluno, nota02Aluno, nota03Aluno, mediaPonderada;
		
		System.out.println("Escreva as notas do aluno!");
		System.out.print("Nota 01: ");
		nota01Aluno = leia.nextDouble();
		System.out.print("Nota 02: ");
		nota02Aluno = leia.nextDouble();
		System.out.print("Nota 03: ");
		nota03Aluno = leia.nextDouble();

		mediaPonderada = (2*nota01Aluno + 3*nota02Aluno + 5*nota03Aluno)/10;

		System.out.println("\nA m�dia final deste aluno � " + mediaPonderada);

	}

}
