package exercicios.aula05_atividades;

public class ProdutoEletronico {
	public String nomeProduto;
	public String tipoProduto;
	public String marca;
	public double tamanho;
	public double precoProduto;
	public boolean funcionando;
	public char funciona = ' ';
	
	public ProdutoEletronico(String nomeProduto, String tipoProduto, String marca, double precoProduto) {
		this.nomeProduto = nomeProduto;
		this.tipoProduto = tipoProduto;
		this.marca = marca;
		this.precoProduto = precoProduto;
	}
}
