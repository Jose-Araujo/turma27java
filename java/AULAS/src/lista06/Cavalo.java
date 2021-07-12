package lista06;

public class Cavalo extends Animal{
	private boolean correr;

	public Cavalo(String nome, int idade, boolean emitirSom, boolean correr) {
		super(nome, idade, emitirSom);
		this.correr = correr;
	}

	public boolean isCorrer() {
		return correr;
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Cavalo emitindo som...");
		
	}
}
