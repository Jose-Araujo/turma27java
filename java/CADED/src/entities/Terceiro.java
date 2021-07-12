package entities;

public class Terceiro extends Funcionario implements Pagamentos{
	
	private double adicional;

	public Terceiro(String matricula, int horasTrabalhadas, double valorHora, double adicional) {
		super(matricula, horasTrabalhadas, valorHora);
		this.adicional = adicional;
	}

	public Terceiro(String matricula, double adicional) {
		super(matricula);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	@Override
	public double salario() {
		return ((this.horasTrabalhadas*this.valorHora) + this.adicional);
	}

	@Override
	public double payExtra() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void paySalario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void payHoras() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
