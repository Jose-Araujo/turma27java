package lista06;

public class ProgramaAnimal {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro("Doguinho", 3, true, true);
		Cavalo cavalo = new Cavalo("Cavalinho", 6, true, true); 
		Preguica preguica = new Preguica("Preguicinha", 19, true, true);
		
		cachorro.emitirSom();
		cavalo.emitirSom();
		preguica.emitirSom();

	}

}
