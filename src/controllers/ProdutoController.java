package controllers;

import models.Produto;
import views.ProdutoView;

public class ProdutoController {
	private Produto model;
	private ProdutoView view;
	
	public ProdutoController (Produto model, ProdutoView view) {
		this.model = model;
		this.view = view;
	}
	
	public String getCodigoProduto() {
		return model.getCodProduto();
	}
	public void setCodigoProduto(String codProduto) {
		model.setCodProduto(codProduto);
	}
	public String getProdNome(){
		return model.getNome();
	}
	public void setProdNome(String nome) {
		model.setNome(nome);
	}
	public String getProdDescricao() {
		return model.getDescricao();
	}
	public void setProdDescricao(String descricao) {
		model.setDescricao(descricao);
	}
	public int getProdQuantidadeEstoque() {
		return model.getQuantidadeEstoque();
	}
	public void setProdQuantidadeEstoque(int quantidadeEstoque) {
		model.setQuantidadeEstoque(quantidadeEstoque);
	}
	public double getProdPreco() {
		return model.getPreco();
	}
	public void setProdPreco(double preco) {
		model.setPreco(preco);
	}
	
	
	public void updateView() {
		view.mostarProduto(model.getCodProduto(), model.getNome(), model.getDescricao(), model.getQuantidadeEstoque(), model.getPreco());
	}
}
