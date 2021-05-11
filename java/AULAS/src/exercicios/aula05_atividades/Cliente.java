package exercicios.aula05_atividades;

public class Cliente {
	//Atributos - é - tem - esta...
	public String nome = "";
	public int idade = 46;
	public String cpf = "000.000.000-x1";
	public int cadastro = 1234;
	public String cartão = "0000 0000 0000 5642" ;
	public double carrinho;
	//Construtor
	public Cliente(String nome,String cpf,int cadastro) {
		this.nome = nome;
		this.cpf = cpf;
		this.cadastro = cadastro;
	}
	//métodos - comportamento - faz - verbo/adverbios...
	public void cadCliente(){
		System.out.println("Nome	: "+nome);
		System.out.println("CPF	: "+cpf);
		System.out.println("Idade	: "+idade);
		System.out.println("Cadastro: "+cadastro);
		System.out.println("Cartão	: "+cartão);
	} 
	
}
