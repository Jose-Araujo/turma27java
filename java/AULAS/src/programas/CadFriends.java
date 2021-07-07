package programas;

import java.util.Scanner;

import objetos.Pessoa;

public class CadFriends {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Pessoa amigo1 = new Pessoa();
		Pessoa amigo2 = new Pessoa();
		
		int idadeTeste;
		
		System.out.println("Digite o nome: ");
		amigo1.nome = leia.next();
		//System.out.println("Digite o sexo M/F/O:");
		//amigo1.sexo = leia.next().charAt(0);
		System.out.println("Digite o ano de nascimento: ");
		amigo1.anoNascimento = leia.nextInt();
		
		System.out.println("Idade: " + (2021 - amigo1.anoNascimento));
		
		System.out.println("Amigo 02");
		System.out.println("Digite o nome: ");
		amigo2.nome = leia.next();
		System.out.println("Digite o ano de nascimento: ");
		amigo2.anoNascimento = leia.nextInt();
		amigo1.anoNascimento = 2000;
		
		idadeTeste = amigo2.calcularIdade(2030);
		System.out.println(amigo1.nome + " sua idade é " + amigo1.calcularIdade());
		System.out.println(amigo2.nome + " sua idade é " + idadeTeste);
		
		/*if((2021 - amigo1.anoNascimento) > (2021 - amigo2.anoNascimento)) {
			System.out.printf("%s é mais velho ", amigo1.nome.toUpperCase());
			
		}else if((2021 - amigo1.anoNascimento) < (2021 - amigo2.anoNascimento)){
			System.out.printf("%s é mais velho ", amigo2.nome.toUpperCase());
			
		}
		
		amigo1.mostrarIdade();
		amigo2.mostrarIdade();*/
		
		
	}

}
