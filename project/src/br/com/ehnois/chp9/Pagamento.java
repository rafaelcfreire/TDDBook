package br.com.ehnois.chp9;

/**
 * @author Rafael_Cassemiro_Fre
 *
 */
public class Pagamento {

	/**
	 * 
	 */
	private double valor;
	
	/**
	 * 
	 */
	private MeioDePagamento meioDePagamento;

	public Pagamento(double valor, MeioDePagamento meioDePagamento) {
		this.valor = valor;
		this.meioDePagamento = meioDePagamento;
	}

	/**
	 * @return
	 */
	public double getValor() {
		return valor;
	}
}
