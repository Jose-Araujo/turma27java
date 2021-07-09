package entidades;

public class ContaEspecial extends Conta{
	//ATRIBUTOS
	private double limite; 
	
	//CONSTRUTOR
	public ContaEspecial(int numero, String nomeCliente, double limite) {
	super(numero, nomeCliente);
	this.limite = limite;
	
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	//MÉTODOS
	public void usarLimite(double valor) {
		this.limite -= valor;
		super.credito(valor);
		
	}
	
}

