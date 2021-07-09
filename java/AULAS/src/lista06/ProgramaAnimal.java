package lista06;

public class ProgramaAnimal {

	public static void main(String[] args) {
		
		Som somanimal = new Som();
		
		somanimal.fazeranimalEmitirSom(new Animal(null, 0, false));
		somanimal.fazeranimalEmitirSom(new Cachorro(null, 0, false, false));
		somanimal.fazeranimalEmitirSom(new Cavalo(null, 0, false, false));
		somanimal.fazeranimalEmitirSom(new Preguica(null, 0, false, false));

	}

}
