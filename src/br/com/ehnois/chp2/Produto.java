package br.com.ehnois.chp2;

/**
 * @author rafaelcfreire
 *
 */
public class Produto {

	/**
	 * 
	 */
	private String nome;
	
	/**
	 * 
	 */
	private double valor;

	/**
	 * @param nome
	 * @param valor
	 */
	public Produto(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	/**
	 * @return
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return
	 */
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
