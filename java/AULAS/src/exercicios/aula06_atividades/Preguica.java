package exercicios.aula06_atividades;

public class Preguica extends Animal {
	// contrutor
	public Preguica(String nome, int idade) {
		super(nome, idade);
		nome = "Preguiça";
		idade = 5;		
	}
	//Metodos
	public void subirArvore(){
		System.out.println("Preguiça subindo a arvore...");
	}
	
	public void emitirSom(){
		System.out.println("Zzz...");
	}

}