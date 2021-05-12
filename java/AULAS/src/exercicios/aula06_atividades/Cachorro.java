package exercicios.aula06_atividades;

public class Cachorro extends Animal {
	public String getNome() {
		return "Nome do animal: "+super.getNome();
	}
	
	// Metodos
	public void correr() {
		System.out.println("Cachorro correndo...");
	}

	public void emitirSom() {
		System.out.println("AU AU!");
	}
	
}