package introducao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadChurras {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		List<Integer> listaPontos = new ArrayList<>();
		List <String> listaChurras = new ArrayList<>();
		
		listaChurras.add("REFRIGERANTE");
		listaChurras.add("PÃO DE ALHO");
		listaChurras.add("QUEIJINHO");
		listaChurras.add("CERVEJA");
		listaChurras.add("CARNE DE JACA");
		listaChurras.add("ABACAXI");
		listaChurras.add("FAROFA");
		listaChurras.add("PICANHA");
		listaChurras.add("ASINHA DE FRANGO");
		listaChurras.add("LINGUIÇA APIMENTADA");
		
		System.out.println("Tamanho da Lista: " + listaChurras.size());
		for(String item:listaChurras) {
			System.out.println("Item: " + item);
		}
		System.out.println();
		System.out.println("Nova lista: ");
		listaChurras.add(1, "TANG");
		
		
		for(String item:listaChurras) {
			System.out.println("Item: " + item);
		}
		
		System.out.println("Tamanho da Lista: " + listaChurras.size());
	
		listaChurras.remove(4);
		
		System.out.println();
		System.out.println("Nova lista sem cerveja: ");
		
		for(String item:listaChurras) {
			System.out.println("Item: " + item);
		}
		
		System.out.println("Tamanho da Lista: " + listaChurras.size());
		
	}

}
