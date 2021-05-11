package exercicios.aula06_atividades;

public class Cavalo extends Animal {
	// contrutor
	public Cavalo(String nome, int idade) {
		super(nome, idade);
		nome = "Cavalo";
		idade = 15;	
	}
	//Metodos
	public void correr(){
		System.out.println("Cavalo correndo...");
	}
	
	public void emitirSom(){
		System.out.println("Hinn in in...");
	}

}
