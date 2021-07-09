package objetos;

public class Conta {
	//ATRIBUTOS
	private int numero;
	
	private double saldo;
	private double limite;
	
	//CONSTRUTOR
	public Conta(int numero) {
		this.numero = numero;
		
	}
	
	public Conta(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
		
	}

	public Conta(int numero, double saldo, double limite) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
	}

	//ENCAPSULAMENTO
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	//MÉTODOS PRÓPRIOS
	public void imprimiExtrato() {
		System.out.println("Conta: " + numero + " Saldo Atual: R$ " + saldo);
		
	}
	
	public void sacar(double valorSaque) {
		if(valorSaque <= 0) {
			System.out.println("Valor informado inválido...");
			
		}
		else if(valorSaque > saldo) {
			System.out.println("Saldo indisponível...");
			
		}else {
			saldo -= valorSaque;
			System.out.println("Saque realizado!");
			
		}
		
		
	}
	
	public void depositar(double valorDeposito){
		if(valorDeposito <= 0) {
			System.out.println("Valor informado inválido...");
						
		}else {
			saldo += valorDeposito;
			System.out.println("Saque realizado!");
			
		}
		
	}
	


}
