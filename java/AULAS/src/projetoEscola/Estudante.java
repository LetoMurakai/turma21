package projetoEscola;

public class Estudante {
	//atributos - CHECK - Segurança
	private int matricula;
	private String cpf;
	private String nome;
	private double pontos;
	private boolean status;
	//construtores
	public Estudante(int matricula, String cpf) {
		super();
		this.matricula = matricula;
		this.cpf = cpf;
	}
	//sobrecarga de construtor
	public Estudante(int matricula, String cpf, boolean status) {
		super();
		this.matricula = matricula;
		this.cpf = cpf;
		this.status = status;
	}
	public Estudante(int matricula, String cpf, double pontos, boolean status) {
		super();
		this.matricula = matricula;
		this.cpf = cpf;
		this.pontos = pontos;
		this.status = status;
	}
	
	//metodos
	public void adicionarNota(double pontos) {
		this.pontos+=pontos;
	}
	public void retirarNota(double pontos) {
		this.pontos-=pontos;
	}
	
	//encapsulamento - gettrs e setters
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
	/*
	public void setPontos(double pontos) {
		this.pontos = pontos;
	}
	*/
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}