package entidades;

public class ContaPoupanca extends Conta{
	//ATRIBUTOS
	private int diaAniversarioPoupanca;

	//CONSTRUTOR
	public ContaPoupanca(int numero, String nomeCliente, int diaAniversarioPoupanca) {
		super(numero, nomeCliente);
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	
	}
	
	//ENCAPSULAMENTO
	public int getDiaAniversarioPoupanca() {
		return diaAniversarioPoupanca;
	}

	public void setDiaAniversarioPoupanca(int diaAniversarioPoupanca) {
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}
	
	


}
