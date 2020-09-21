package controllers;

import models.Telefone;
import views.TelefoneView;

public class TelefoneController {
	private Telefone model;
	private TelefoneView view;
	
	public TelefoneController (Telefone model, TelefoneView view) {
		this.model = model;
		this.view = view;
	}
	

	public int getId() {
		return model.getIdTelefone();
	}
	
	public String getTelefonePais() {
		return model.getPais();
	}
	public void setTelefonePais(String pais) {
		model.setPais(pais);
	}
	public String getTelefoneDdd() {
		return model.getDdd();
	}
	public void setTelefoneDdd(String ddd) {
		model.setDdd(ddd);
	}
	public String getTelefoneNumero() {
		return model.getTelefone();
	}
	public void setTelefoneNumero(String telefone) {
		model.setTelefone(telefone);
	}
	
	public void updateView() {
		view.mostrarTelefone(model.getPais() , model.getDdd(), model.getTelefone());
	}
}
