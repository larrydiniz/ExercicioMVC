package views;

public class PedidoView {
	public void mostarPedido(int codPedido, String notaFiscal, String dataPedido, double valorTotal, String status) {
		System.out.println("\nPedido: \n" + codPedido);
		System.out.println("Nota fiscal: " +notaFiscal + "  Data: "+ dataPedido);
		System.out.println("Valor total: R$"+ valorTotal + "  Status: "+status);
	}
}
