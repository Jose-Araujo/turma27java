package aplicacoes;

import java.util.Scanner;

import entidades.Conta;
import entidades.ContaEspecial;
import entidades.ContaEstudantil;
import entidades.ContaPoupanca;

public class TesteBank {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double valor;
		String nome;
		int numero;
		
		System.out.println("Nome cliente: ");
		nome = leia.next();
		System.out.println("Numeor cliente: ");
		numero = leia.nextInt();
		//ContaEspecial ce1 = new ContaEspecial(numero,  nome, 1000);
		ContaEstudantil cne1 = new ContaEstudantil(numero, nome, 5000);
		
		
		//Conta cli1 = new Conta(numero, nome);
		//ContaPoupanca cp1 = new ContaPoupanca(5,  "Marcos", 15);
		//ContaEspecial ce1 = new ContaEspecial(5,  "Marcos", 15);
		
		
		System.out.println("Cliente: " + cne1.getNomeCliente());
		System.out.println("Saldo Atual: R$" + cne1.getSaldo());
		System.out.println("Digite o valor do Credito: ");
		valor = leia.nextDouble();
		
		cne1.credito(valor);
		System.out.println("Saldo Atual: R$" + cne1.getSaldo());
		
		System.out.println("Digite o valor do Debito: ");
		valor = leia.nextDouble();
		
		if(cne1.getSaldo() < valor) {
			double auxValor = valor - cne1.getSaldo();
			cne1.usarLimiteEstudantil(auxValor);
			System.out.println("Limite atual: " + cne1.getLimiteEstudantil());
		}
		
		System.out.println("Saldo Atual: R$" + cne1.getSaldo());
		
		cne1.debito(valor);
		
		System.out.println("Saldo Atual: R$ " + cne1.getSaldo());
	
	}

}
