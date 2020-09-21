package controllers;

import models.Endereco;
import views.EnderecoView;

public class EnderecoController {
	private Endereco model;
	private EnderecoView view;
	
	public EnderecoController (Endereco model, EnderecoView view) {
		this.model = model;
		this.view = view;
	}
	
	public int getEnderecoId() {
		return model.getIdEndereco();
	}
	public String getEnderecoCep() {
		return model.getCep();
	}
	public void setEnderecoCep(String cep) {
		model.setCep(cep);
	}
	public String getEnderecoRua_numero() {
		return model.getRua_numero();
	}
	public void setEnderecoRua_numero(String rua_numero) {
		model.setRua_numero(rua_numero);
	}
	public String getEnderecoComplemento() {
		return model.getComplemento();
	}
	public void setEnderecoComplemento(String complemento) {
		model.setComplemento(complemento);
	}
	public String getEnderecoBairro() {
		return model.getBairro();
	}
	public void setEnderecoBairro(String bairro) {
		model.setBairro(bairro);
	}
	public String getEnderecoCidade() {
		return model.getCidade();
	}
	public void setEnderecoCidade(String cidade) {
		model.setCidade(cidade);
	}
	public String getEnderecoEstado() {
		return model.getEstado();
	}
	public void setEnderecoEstado(String estado) {
		model.setEstado(estado);
	}
	public String getEnderecoPais() {
		return model.getPais();
	}
	public void setEnderecoPais(String pais) {
		model.setPais(pais);
	}
	public int getEnderecoFkIdCliente() {
		return model.getFkIdCliente();
	}
	public void updateView() {
		view.mostrarEndereco(model.getCep(), model.getRua_numero(), model.getComplemento(), model.getBairro(), model.getCidade(),
				model.getEstado(), model.getPais());
	}
}
