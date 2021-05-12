package exercicios.aula06_atividades;

public abstract class Animal {
	// Atributos
	private String nome;
	private int idade;

	public Animal() {
		
	}

	// Metodos
	public void emitirSom() {
		System.out.println("Som...");
	}

	public void correr() {
		
	}

	public void subirArvore() {
		
	}
	
	// Encapsulamento - getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(final String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(final int idade) {
		this.idade = idade;
	}

}
