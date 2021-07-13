package introducao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaulistinhaPOO {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		List<Time> tabela = new ArrayList<>();
		
		tabela.add(new Time("PALMEIRAS"));
		tabela.add(new Time("SANTOS"));
		tabela.add(new Time("SPFC"));
		tabela.add(new Time("PONTE PRETA"));
		tabela.add(new Time("CORINTHIANS"));
		
		tabela.add(0, new Time("MENGO"));
		
	//	System.out.println(tabela.get(3).getNome().toLowerCase());
		System.out.println(tabela.indexOf("SPFC"));
		
	/*	for(Time e:tabela) {
			System.out.println("Time de SP" + e.getNome());
		}
	*/	
	}

}
