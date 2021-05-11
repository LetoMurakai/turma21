package exercicios.aula06_atividades;

public class Cachorro extends Animal {
	//contrutor
	public Cachorro(String nome, int idade) {
		super(nome, idade);
		nome = "Cachorro";
		idade = 8;	
	}
	//Metodos
	public void correr() {
		System.out.println("Cachorro correndo...");
	}

	public void emitirSom() {
		System.out.println("AU AU!");
	}
	
	

}
