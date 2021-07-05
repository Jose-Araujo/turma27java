package lista03;

import java.util.Locale;
import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		//LISTA 03
		//QUESTÃO 02
		//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 
		//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando 
		//idade for =-99. (WHILE)	
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int idadeUsuario = 0;
		int totalPessoasMedosDe21Anos = 0, totalPessoasMedosDe50Anos = 0; 
		
		while(idadeUsuario != -99) {
			System.out.print("Informe sua idade: ");
			idadeUsuario = leia.nextInt();
			if(idadeUsuario > 0) {
				if(idadeUsuario <= 21 && idadeUsuario != -99) {
					totalPessoasMedosDe21Anos++;
					
				}else if(idadeUsuario >= 50) {
					totalPessoasMedosDe50Anos++;
					
				}				
			}else if(idadeUsuario != -99){
				System.out.println("A idade informada é inválida!");
				
			}

		}
		
		System.out.println("Total de pessoas com menos de 21 anos: " + totalPessoasMedosDe21Anos);
		System.out.println("Total de pessoas com menos de 50 anos: " + totalPessoasMedosDe50Anos);
			
	}

}
