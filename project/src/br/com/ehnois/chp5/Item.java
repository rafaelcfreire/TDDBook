package br.com.ehnois.chp5;

/**
 * @author Rafael_Cassemiro_Fre
 *
 */
public class Item {

	/**
	 * 
	 */
	private String descricao;
	
	/**
	 * 
	 */
	private int quantidade;
	
	/**
	 * 
	 */
	private double valorUnitario;

	public Item(String descricao, int quantidade, double valorUnitario) {
		super();
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
	}
	
	/**
	 * @return
	 */
	public double getValorTotal() {
		return this.valorUnitario * this.quantidade;
	}

	/**
	 * @return
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @return
	 */
	public int getQuantidade() {
		return quantidade;
	}

	/**
	 * @return
	 */
	public double getValorUnitario() {
		return valorUnitario;
	}
}
