package classes;

public class Terceiro extends Funcionario{
	private double adicional;
	
	public Terceiro(String matricula, int horasTrabalhadas, double valorHora, String nome, double adicional) {
		super(matricula, horasTrabalhadas, valorHora, nome);
		this.adicional = adicional;
	}
	
	// Metodo
	@Override
	public double Salario(){
		return (horasTrabalhadas*valorHora + adicional);
	}

	// Encapsulamento - getters e setters
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	
}
