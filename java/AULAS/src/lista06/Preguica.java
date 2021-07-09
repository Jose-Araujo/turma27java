package lista06;

public class Preguica extends Animal{
	private boolean subirArvore;

	public Preguica(String nome, int idade, boolean emitirSom, boolean subirArvore) {
		super(nome, idade, emitirSom);
		this.subirArvore = subirArvore;
	}

	public boolean isSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(boolean subirArvore) {
		this.subirArvore = subirArvore;
	}
	
	public void emitirSom() {
		System.out.println("Preguica emitindo som...");
		
	}
	
}
