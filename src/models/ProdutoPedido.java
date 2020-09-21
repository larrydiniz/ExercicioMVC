package models;

public class ProdutoPedido {
	private String codProduto = "7908010134506";
	private int codPedido = 1;
	private int quantidade;
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getCodProduto() {
		return codProduto;
	}
	public int getCodPedido() {
		return codPedido;
	}
	
	
}
