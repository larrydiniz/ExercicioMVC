package mvc;

import controllers.*;
import models.*;
import views.*;

public class MVC {

	public static void main(String[] args) {
	      ClienteController c = new ClienteController( new Cliente(), new ClienteView());
	      c.setClienteNome("Isabelle Sousa"); c.setClienteCpf("368.912.069-10"); 
	      c.setClienteEmail("isabelles@outlook.com"); c.setClienteNasc("08/02/1968");

	      c.updateView();
	      
	      
	      TelefoneController t = new TelefoneController( new Telefone(), new TelefoneView());
	      t.setTelefoneDdd("067"); t.setTelefoneNumero("7149-6981"); t.setTelefonePais("+55");

	      t.updateView();

	      EnderecoController e = new EnderecoController (new Endereco(), new EnderecoView());
	      e.setEnderecoCep("79033-410"); e.setEnderecoRua_numero("Rua Herculano Metello Peres, 1002");
	      e.setEnderecoBairro("Conj. Residencial Mata do Jacinto"); e.setEnderecoCidade("Campo Grande");
	      e.setEnderecoEstado("Mato grosso do Sul"); e.setEnderecoPais("Brasil");
	      
	      e.updateView();
	      
	      PedidoController ped = new PedidoController (new Pedido(), new PedidoView());
	      ped.setCodigoPedido(1); ped.setPedNotaFiscal("6566/3"); ped.setDataPed("23/06/2020");
	      ped.setPedValorTotal(159.42); ped.setPedStatus("Entregue");
	      
	      ped.updateView();
	      
	      ProdutoPedidoController pPed = new ProdutoPedidoController (new ProdutoPedido(), new ProdutoPedidoView());
	      pPed.setQuantidadePedida(1);
	      
	      pPed.updateView();
	      
	      
	      ProdutoController p = new ProdutoController (new Produto(), new ProdutoView());
	      p.setCodigoProduto("7908010134506"); p.setProdNome("War Vikings");
	      p.setProdDescricao("De 2 a 4 jogadores"); p.setProdPreco(129.42); p.setProdQuantidadeEstoque(3);
	      
	      p.updateView();
	}
}


