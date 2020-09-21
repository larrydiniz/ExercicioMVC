package views;

public class ClienteView {
	public void mostrarCliente (String nomeCliente, String cpfCliente, String emailCliente, String dataNascimento) {
		System.out.println("Cliente: \n");
		System.out.println("Nome: " + nomeCliente);
		System.out.println("CPF: "+cpfCliente);
		System.out.println("Email: "+emailCliente);
		System.out.println("Nascimento: " +dataNascimento );
	}
}
