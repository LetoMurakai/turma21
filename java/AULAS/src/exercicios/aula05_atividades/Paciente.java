package exercicios.aula05_atividades;

public class Paciente {
	
	public String nome;
	public int anoNascimento;
	public char genero = ' ';
	public boolean vivo;
	public char estado = ' ';
	
	public char getEstado() {
		return estado;
	}
	public void setEstado(char estado) {
		this.estado = estado;
	}
	
	public void infoPaciente(){
		System.out.println("Nome	: "+nome);
		System.out.println("Idade	: "+ (2021 - anoNascimento));
		if(this.genero == 'M') {
			System.out.println("Genero : Masculino");
		}else if(this.genero == 'F') {
			System.out.println("Genero : Feminino");
		}else {
			System.out.println("Genero : Outro");
		}
		if (this.vivo) {
			System.out.println("O paciente está bem!");
		}
		else {
			System.out.println("O paciente veio a óbito!");
		}
	}
	
}
