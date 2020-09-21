package controllers;

import models.Pedido;
import views.PedidoView;

public class PedidoController {
	private Pedido model;
	private PedidoView view;
	
	public PedidoController (Pedido model, PedidoView view) {
		this.model = model;
		this.view = view;
	}
	
	public int getCodigoPedido() {
		return model.getCodPedido();
	}
	public void setCodigoPedido(int codPedido) {
		model.setCodPedido(codPedido);
	}
	public String getPedNotaFiscal() {
		return model.getNotaFiscal();
	}
	public void setPedNotaFiscal(String notaFiscal) {
		model.setNotaFiscal(notaFiscal);
	}
	public String getDataPed() {
		return model.getDataPedido();
	}
	public void setDataPed(String dataPedido) {
		model.setDataPedido(dataPedido);
	}
	public double getPedValorTotal() {
		return model.getValorTotal();
	}
	public void setPedValorTotal(double valorTotal) {
		model.setValorTotal(valorTotal);
	}
	public String getPedStatus() {
		return model.getStatus();
	}
	public void setPedStatus(String status) {
		model.setStatus(status);
	}
	public int getPedFkIdCliente() {
		return model.getFkIdCliente();
	}
	
	public void updateView() {
		view.mostarPedido(model.getCodPedido() , model.getNotaFiscal(), model.getDataPedido(), model.getValorTotal(), model.getStatus());
	}
	
}
