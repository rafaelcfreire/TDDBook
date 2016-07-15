package br.com.ehnois.chp8;

import java.util.Calendar;

/**
 * @author Rafael_Cassemiro_Fre
 *
 */
public class NotaFiscal {

	/**
	 * 
	 */
	private String cliente;
	
	/**
	 * 
	 */
	private double valor;
	
	/**
	 * 
	 */
	private Calendar data;

	public NotaFiscal(String cliente, double valor, Calendar data) {
		this.cliente = cliente;
		this.valor = valor;
		this.data = data;
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
	public double getValor() {
		return valor;
	}

	/**
	 * @return
	 */
	public Calendar getData() {
		return data;
	}
}
