package classes;

public class Basico  extends Estudantes{
	//Atributos
	private int diaAniversario;

	//Construtor
	public Basico(int matricula, String cpf, int diaAniversario) {
		super(matricula, cpf);
		this.diaAniversario = diaAniversario;
	}

	public Basico(String nome, int matricula, String cpf, boolean status, int diaAniversario) {
		super(nome, matricula, cpf, status);
		this.diaAniversario = diaAniversario;
	}

	//Encapsulamento - getters and setters
	public int getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	
	//Metodos
	public void bonusAniversario(int dia) {
		if(diaAniversario == dia) {
			super.adicionarNota((super.getPontos()*0.1));
		}
	}
	
}//Fim classes
