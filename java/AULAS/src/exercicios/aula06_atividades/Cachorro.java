package exercicios.aula06_atividades;

public class Cachorro extends Animal {
	public String getNome() {
		return super.getNome();
	}
	
	// Metodos
	public void correr() {
		System.out.println("Cachorro está correndo...");
	}

	public void emitirSom() {
		System.out.println("AU AU!");
	}
	
}