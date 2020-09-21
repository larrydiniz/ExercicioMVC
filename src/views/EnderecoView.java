package views;

public class EnderecoView {
	public void mostrarEndereco (String cep, String rua_numero, String complemento, String bairro, String cidade, 
			String estado, String pais) {
		System.out.println("Endereço: " + rua_numero + ", " + complemento +", " + bairro);
		System.out.println( cidade +", " + pais);
		System.out.println("CEP: "+cep+"\n");
		System.out.println("-------------------------------------");
	}
}
