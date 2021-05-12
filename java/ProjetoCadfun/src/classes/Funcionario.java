package classes;

public class Funcionario {
	//Atributos
	private String  matricula;
	protected int horasTrabalhadas;
	protected double valorHora;
	private String nome;
	
	// Construtor
	public Funcionario(String matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}
	// Sobrecarga de Construtor
	public Funcionario(String matricula, int horasTrabalhadas, double valorHora, String nome) {
		this.matricula = matricula;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
		this.nome = nome;
	}
	
	// Metodos
	public double Salario() {
		return (horasTrabalhadas * valorHora);
	}

	// Encapsulamento - getters e setters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
