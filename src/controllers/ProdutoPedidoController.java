package controllers;

import models.ProdutoPedido;
import views.ProdutoPedidoView;

public class ProdutoPedidoController {
	private ProdutoPedido model;
	private ProdutoPedidoView view;
	
	public ProdutoPedidoController (ProdutoPedido model, ProdutoPedidoView view) {
		this.model = model;
		this.view = view;
	}
	
	
	public int getQuantidadePedida() {
		return model.getQuantidade();
	}
	public void setQuantidadePedida(int quantidade) {
		model.setQuantidade(quantidade);
	}
	public String getCodProdutoPed() {
		return model.getCodProduto();
	}
	public int getCodigoPedidoC() {
		return model.getCodPedido();
	}
	
	public void updateView() {
		view.mostrarProdutoPedido(model.getQuantidade());
	}
}
