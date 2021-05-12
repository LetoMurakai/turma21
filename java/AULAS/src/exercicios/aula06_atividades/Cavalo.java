package exercicios.aula06_atividades;

public class Cavalo extends Animal {
	public String getNome() {
		return "Nome do animal: "+super.getNome();
	}
	
	// Metodos
	public void correr() {
		System.out.println("Cavalo galopando...");
	}
	
	public void emitirSom() {
		System.out.println("Hinn in in...");
	}

}