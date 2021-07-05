package lista03;

import java.util.Locale;
import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		//LISTA 03
		//QUESTÃO 01
		//Informar todos os números de 1000 a 1999 que quando divididos por 11 
		//obtemos resto = 5. (FOR)
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		for(int contagem = 1000; contagem <= 1999; contagem++) {
			if(contagem%11 == 5) {
				System.out.print(contagem + " ");

			}
		}
	}

}
