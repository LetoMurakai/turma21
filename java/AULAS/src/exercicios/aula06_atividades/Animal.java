package exercicios.aula06_atividades;

public class Animal {
	//Atributos
	private String nome;
	private int idade;
	
	//construtor
	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	//Metodos
	public void emitirSom() {
		System.out.println("Som do animal!");
	}
	//Encapsulamento - getters and setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
