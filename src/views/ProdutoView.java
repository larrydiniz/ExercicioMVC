package views;

public class ProdutoView {
	public void mostarProduto(String codProduto, String nome, String descricao, int quantidadeEstoque, double preco) {
		System.out.println("Produto: " + nome);
		System.out.println("C�digo: "+codProduto);
		System.out.println("Descri��o: "+descricao);
		System.out.println("Pre�o: R$" +preco + "  Quantidade em Estoque: " +quantidadeEstoque + "und");
	}
}
