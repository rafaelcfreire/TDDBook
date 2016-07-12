package br.com.ehnois.chp9;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rafael_Cassemiro_Fre
 *
 */
public class Fatura {

	/**
	 * 
	 */
	List<Pagamento> pagamentos = new ArrayList<Pagamento>();
	
	/**
	 * 
	 */
	private String nomeCliente;
	
	/**
	 * 
	 */
	private double valor;
	
	/**
	 * 
	 */
	private boolean pago;

	public Fatura(String nomeCliente, double valor) {
		this.nomeCliente = nomeCliente;
		this.valor = valor;
	}

	/**
	 * @return
	 */
	public List<Pagamento> getPagamentos() {
		return pagamentos;
	}

	/**
	 * @return
	 */
	public String getNomeCliente() {
		return nomeCliente;
	}

	/**
	 * @return
	 */
	public double getValor() {
		return valor;
	}

	/**
	 * @return
	 */
	public boolean isPago() {
		return pago;
	}

	/**
	 * @param pago
	 */
	public void setPago(boolean pago) {
		this.pago = pago;
	}
}
