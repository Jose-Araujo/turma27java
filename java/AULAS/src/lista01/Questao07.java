package lista01;

import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Questao07 {

	public static void main(String[] args) {
		//LISTA 01
		//QUESTÃO 07
		// Um sistema de equações lineares do tipo:
		//ax + by = c, dx + ey = f, pode ser resolvido segundo mostrado abaixo
		//x = (ce - bf)/(ae - bd)
		//y = (af - cd)/(ae - bd)
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		double coeficienteA, coeficienteB, coeficienteC, coeficienteD, coeficienteE, coeficienteF, valorX, valorY;

		System.out.println("Digite os coeficientes!");
		System.out.print("Coeficente A: ");
		coeficienteA = leia.nextDouble();
		System.out.print("Coeficente B: ");
		coeficienteB = leia.nextDouble();
		System.out.print("Coeficente C: ");
		coeficienteC = leia.nextDouble();
		System.out.print("Coeficente D: ");
		coeficienteD = leia.nextDouble();
		System.out.print("Coeficente E: ");
		coeficienteE = leia.nextDouble();
		System.out.print("Coeficente F: ");
		coeficienteF = leia.nextDouble();

		valorX = (coeficienteC*coeficienteE - coeficienteB*coeficienteF)/(coeficienteA*coeficienteE - coeficienteB*coeficienteD);
		valorY = (coeficienteA*coeficienteF - coeficienteC*coeficienteD)/(coeficienteA*coeficienteE - coeficienteB*coeficienteD);

		System.out.println("O valor de X é " + new DecimalFormat("0.00").format(valorX));
		System.out.println("O valor de Y é " + new DecimalFormat("0.00").format(valorY));

	}

}
