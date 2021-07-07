package programas;

import java.util.Scanner;

import objetos.Pessoa;
import objetos.Front;

public class CadBanca {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Pessoa cliente1 = new Pessoa();
		Front colocalinha = new Front();
		
		System.out.print("Digite seu nome: ");
		cliente1.nome = leia.next();
		System.out.print("Digite o ano de nascimento: ");
		cliente1.anoNascimento = leia.nextInt();
		
		colocalinha.linha(100);
		
		if(cliente1.calcularIdade(2021) >= 18) {
			System.out.println("Pode comprar tudo!!");
		}else {
			System.out.println("Conteúdo proibido para menores de 18 anos!!");
		}
	}

}
