package controllers;

import models.Cliente;
import views.ClienteView;

public class ClienteController {
	private Cliente model;
	private ClienteView view;
	
	public ClienteController (Cliente model, ClienteView view) {
		this.model = model;
		this.view = view;
	}
	

	public String getClienteNome() {
		return model.getNome();
	}
	public void setClienteNome(String nome) {
		model.setNome(nome);
	}
	public String getClienteCpf() {
		return model.getCpf();
	}
	public void setClienteCpf(String cpf) {
		model.setCpf(cpf);
	}
	public String getClienteEmail() {
		return model.getEmail();
	}
	public void setClienteEmail(String email) {
		model.setEmail(email);
	}
	public String getClienteNasc() {
		return model.getDataNascimento();
	}
	public void setClienteNasc(String dataNascimento) {
		model.setDataNascimento(dataNascimento);
	}
	
	
	public void updateView() {
		view.mostrarCliente(model.getNome(), model.getCpf(), model.getEmail(), model.getDataNascimento());
	}
}
