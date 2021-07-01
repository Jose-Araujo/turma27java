package introducao;

public class NomeTemperatura {

	public static void main(String[] args) {
		//Grupo 02
		//Ler nome de usuário e uma temperatura
		//Grupos pares ler temperatura em Celsius e converter para Farenheit 
		//Grupos impares ler temperatura em Farenheit e converter para Celsius
		
		String nomeUsuario = "EPAMINONDAS";
		double temperaturaCelsius = 25.0;
		double temperaturaFarenheit, temperaturaKelvin; 
		
		temperaturaFarenheit = 1.8*temperaturaCelsius + 32; 
		temperaturaKelvin = temperaturaCelsius + 273.15;
		
		System.out.println("O nome do usuário é: \t" + nomeUsuario);
		System.out.println("A temperatura em Celsius é: \t" + temperaturaCelsius);
		System.out.println("A temperatura em Farenheit é: \t" + temperaturaFarenheit);
		System.out.println("A temperatura em Kelvin é: \t" + temperaturaKelvin);
		
		
	}

}
