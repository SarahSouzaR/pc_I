package composicao;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {

	private String idPedido;
	private Date data;
	private double valorDesconto;
	
	private ArrayList <ItemPedido> itemPedido;
	
	public Pedido() {
		itemPedido = new ArrayList <ItemPedido>();
	}
	
	public void add(ItemPedido umPedido) {
		ItemPedido.add(umPedido);
	}
}
