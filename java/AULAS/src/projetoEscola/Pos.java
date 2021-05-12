package projetoEscola;

public class Pos extends Estudante {
	//Atributos
	private double credito = 5.00;
	private double qtde = 0.00;
	private int pedirCreditoPos;
	
	//Construtor
	public Pos(int matricula, String cpf, double credito) {
		super(matricula,cpf);
		this.credito = credito;

	}
	
	//Metodos
	public void creditoPos(int credito) {
		if(pedirCreditoPos == 'S'){
			super.adicionarNota(1);
			credito = credito - qtde;
		}
	}
	public void tirarNotas(double credito) {
		if((super.getPontos()+credito) >= credito) {
			super.retirarNota(pontos);
		}
	}
	//encapsulamento - gettrs e setters

}
