package exercicios.aula06_atividades;

public class Atividade01 {
	/*1- Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
		comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
		características de forma que tudo o que for comum a todos os animais fique na classe
		Animal:
	 */
	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro("Cachorro", 8);
		Cavalo cavalo = new Cavalo("Cavalo",15);
		Preguica preguica = new Preguica("Preguiça",5);
		
		System.out.println("Animal: "+cachorro.getNome()+" idade "+cachorro.getIdade());
		
		cachorro.correr();
		cachorro.emitirSom();
		
		System.out.println("\nAnimal: "+cavalo.getNome()+" idade "+cavalo.getIdade());
		
		cavalo.correr();
		cavalo.emitirSom();
		
		System.out.println("\nAnimal: "+preguica.getNome()+" idade "+preguica.getIdade());
		
		preguica.subirArvore();
		preguica.emitirSom();
		
	}

}
