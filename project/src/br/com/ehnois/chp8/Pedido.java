package br.com.ehnois.chp8;

/**
 * @author Rafael_Cassemiro_Fre
 *
 */
public class Pedido {

	/**
	 * 
	 */
	private String cliente;
	
	/**
	 * 
	 */
	private double valorTotal;
	
	/**
	 * 
	 */
	private int quantidadeItens;

	public Pedido(String cliente, double valorTotal, int quantidadeItens) {
		this.cliente = cliente;
		this.valorTotal = valorTotal;
		this.quantidadeItens = quantidadeItens;
	}

	/**
	 * @return
	 */
	public String getCliente() {
		return cliente;
	}

	/**
	 * @return
	 */
	public double getValorTotal() {
		return valorTotal;
	}

	/**
	 * @return
	 */
	public int getQuantidadeItens() {
		return quantidadeItens;
	}
}
