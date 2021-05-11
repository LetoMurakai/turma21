package exercicios.aula05_atividades;

public class ProdutoEletronico {
	public String nomeProduto;
	public String tipoProduto;
	public String marca;
	public double tamanho;
	public double precoProduto;
	public boolean funcionando;
	public char funciona = ' ';
	
	public ProdutoEletronico(String nomeProduto, String tipoProduto, String marca, double precoProduto,boolean funcionando) {
		super();
		this.nomeProduto = nomeProduto;
		this.tipoProduto = tipoProduto;
		this.marca = marca;
		this.precoProduto = precoProduto;
		this.funcionando = funcionando;
	}
	public void funciona() {
		if(funciona == 'S') {
			funcionando = true;
			System.out.println("Aparelho funcionando!!!");
		}else {
			System.out.println("Pane no sistema!!!!!!");
		}
	}
	
}
