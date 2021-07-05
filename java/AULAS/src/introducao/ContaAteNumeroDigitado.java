package introducao;

import java.util.Locale;
import java.util.Scanner;

public class ContaAteNumeroDigitado {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int numeroDoTeclado;
		int contaAteoNumeroTeclado = 1, somaDosNumeros = 0;

		System.out.print("Digite um número no Teclado: ");
		numeroDoTeclado = leia.nextInt();
		
		if(numeroDoTeclado <= 0) {
			System.out.print("Número inválido! Informe um valor maior que zero.");
		}else if(numeroDoTeclado == 1){
			System.out.print("Soma: " + numeroDoTeclado);
			
		}else {
			do{
				if(contaAteoNumeroTeclado == 1) {
					System.out.print("Soma: ");
				}
				
				somaDosNumeros += contaAteoNumeroTeclado;
				System.out.print("" + contaAteoNumeroTeclado);
				contaAteoNumeroTeclado++;
				
				if(contaAteoNumeroTeclado <= numeroDoTeclado){
					System.out.print(" + ");
				}
				
			}while(contaAteoNumeroTeclado <= numeroDoTeclado);

			System.out.println(" = " + somaDosNumeros);
		}

	}
}

