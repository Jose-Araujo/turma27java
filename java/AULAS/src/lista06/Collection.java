package lista06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collection {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		List<Produto> produto = new ArrayList<Produto>(); 

		Produto prod1 = new Produto("CAMISA", 10);
		Produto prod2 = new Produto("CALÇA", 4);
		Produto prod3 = new Produto("SHORT", 6);
		Produto prod4 = new Produto("BLUSA", 2);
		Produto prod5 = new Produto("TÊNIS", 22);
		
		produto.add(prod1);
		produto.add(prod2);
		produto.add(prod3);
		produto.add(prod4);
		produto.add(prod5);
		
		System.out.println("QUANTIDAdE DE PRODUTOS NO ESTOQUE: " + produto.size() + "\n");
		for(Produto estoque:produto) {
			System.out.println("Produtos em estoque: " + estoque + "\tQuantidade: " + estoque.getQuantidadeProduto());
		}
		
		System.out.println("\nREMOVENDO PRODUTO DO ESTOQUE");
		
		produto.remove(3); //BLUSA
		
		System.out.println("QUANTIDAdE DE PRODUTOS NO ESTOQUE: " + produto.size() + "\n");
		for(Produto estoque:produto) {
			System.out.println("Produtos em estoque: " + estoque + "\tQuantidade: " + estoque.getQuantidadeProduto());
		}
		
		System.out.println("\nATUALIZANDO PRODUTO DO ESTOQUE");
		
		produto.add(new Produto("JAQUETA", 15));
		produto.add(new Produto("ÓCULOS", 9));
		produto.add(new Produto("CACHECOL", 135));
		produto.add(new Produto("BOTA", 54));
		
		System.out.println("QUANTIDAdE DE PRODUTOS NO ESTOQUE: " + produto.size() + "\n");
		for(Produto estoque:produto) {
			System.out.println("Produtos em estoque: " + estoque + "\tQuantidade: " + estoque.getQuantidadeProduto());
		}
	}

}
