package models;

public class Endereco {
	private int idEndereco = 1;
	private String cep;
	private String rua_numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String pais;
	private int fkIdCliente = 1;
	
	public int getIdEndereco() {
		return idEndereco;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getRua_numero() {
		return rua_numero;
	}
	public void setRua_numero(String rua_numero) {
		this.rua_numero = rua_numero;
	}
	public String getComplemento() {
		if (complemento == null) {
			return "s/c";
		}
		else {
		return complemento;
		}
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getFkIdCliente() {
		return fkIdCliente;
	}
}
