package views;

public class ProdutoView {
	public void mostarProduto(String codProduto, String nome, String descricao, int quantidadeEstoque, double preco) {
		System.out.println("Produto: " + nome);
		System.out.println("Código: "+codProduto);
		System.out.println("Descrição: "+descricao);
		System.out.println("Preço: R$" +preco + "  Quantidade em Estoque: " +quantidadeEstoque + "und");
	}
}
