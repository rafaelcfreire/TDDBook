package br.com.ehnois.chp4;

/**
 * @author rafaelcfreire
 *
 */
public class Funcionario {

	/**
	 * 
	 */
	private String nome;

	/**
	 * 
	 */
	private double salario;

	/**
	 * 
	 */
	private Cargo cargo;

	public Funcionario(String nome, double salario, Cargo cargo) {
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
	}

	/**
	 * @return
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @return
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * @return
	 */
	public Cargo getCargo() {
		return cargo;
	}
}
