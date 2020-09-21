package models;

public class Telefone {
	private int idTelefone = 1;
	private String pais;
	private String ddd;
	private String telefone;
	private int fkIdCliente = 1;
	
	public int getIdTelefone() {
		return idTelefone;
	}
		
	public String getPais() {
		return pais + " ";
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public String getDdd() {
		return "(" + ddd + ") ";
	}
	
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public int getFkIdCliente() {
		return fkIdCliente;
	}
}
