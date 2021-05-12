package exercicios.aula06_atividades;

public class Preguica extends Animal {
	public String getNome() {
		return "Nome do animal: "+super.getNome();
	}

	// Metodos
	public void subirArvore() {
		System.out.println("Preguiça subindo a arvore...");
	}
	
	public void emitirSom() {
		System.out.println("Zzz...");
	}

}