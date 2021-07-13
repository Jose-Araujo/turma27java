package lista06;

public class Produto {
	private String nomeProduto;
	private int quantidadeProduto;
	
	public Produto(String nomeProduto, int quantidadeProduto) {
		super();
		this.nomeProduto = nomeProduto;
		this.quantidadeProduto = quantidadeProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}

	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}

	public String toString() {
		return this.nomeProduto;
	}
	
	public int quantidadeEstoque() {
		return this.quantidadeProduto;
	}

}
