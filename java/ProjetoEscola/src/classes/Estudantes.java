package classes;

public class Estudantes {
	//Atributos - check - segurança - private
	private String nome;
	private int matricula;
	private String cpf;
	private double pontos;
	private boolean status;
	
	//Construtores - check
	public Estudantes(int matricula, String cpf) {
		super();
		this.matricula = matricula;
		this.cpf = cpf;
	}
	
	//Sobrecarga de construtor - check
	public Estudantes(String nome, int matricula, String cpf, boolean status) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.cpf = cpf;
		this.status = status;
	}
	
	//Encapsulamento - getters and setters - check
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getPontos() {
		return pontos;
	}

	/*public void setPontos(double pontos) {
		this.pontos = pontos;
	}*/

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	//Metodos - check
	public void adicionarNota(double pontos) {
		this.pontos = this.pontos + pontos;
	}
	
	public void retirarNota(double pontos) {
		this.pontos = this.pontos - pontos;
	}
	
}//Fim classes.
