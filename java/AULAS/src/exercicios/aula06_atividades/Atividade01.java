package exercicios.aula06_atividades;

public class Atividade01 {
	/*1- Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
		comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
		características de forma que tudo o que for comum a todos os animais fique na classe
		Animal:
	 */
	public static void main(String[] args) {
	    
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Azulão");
		cachorro.setIdade(8);
		
		Cavalo cavalo = new Cavalo();
		cavalo.setNome("Plotka");
		cavalo.setIdade(15);
	
		Preguica preguica = new Preguica();
		preguica.setNome("Pri");
		preguica.setIdade(12);
	
		
		Animal animais[] = new Animal[3];
		animais[0] = cachorro;
		animais[1] = cavalo;
		animais[2] = preguica;
		
		for(Animal pet:animais) {
			System.out.println("Nome do animal: "+pet.getNome());
			System.out.println("Idade: "+pet.getIdade());
			pet.emitirSom();
			pet.correr();
			pet.subirArvore();
			System.out.println();
		}
		
	}

}
