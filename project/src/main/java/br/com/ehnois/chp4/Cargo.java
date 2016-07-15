package br.com.ehnois.chp4;

import br.com.ehnois.chp7.DezOuVintePorCento;
import br.com.ehnois.chp7.QuinzeOuVinteCincoPorCento;
import br.com.ehnois.chp7.RegraDeCalculo;

/**
 * @author rafaelcfreire
 *
 */
public enum Cargo {

	DESENVOLVEDOR(new DezOuVintePorCento()), 
	DBA(new QuinzeOuVinteCincoPorCento()), 
	TESTADOR(new QuinzeOuVinteCincoPorCento());

	/**
	 * Variavel de instancia responsavel por decidir em tempo de execucao com
	 * regra de calculo sera usada. Strategy pattern.
	 */
	private final RegraDeCalculo regra;

	Cargo(RegraDeCalculo regra) {
		this.regra = regra;
	}

	/**
	 * @return
	 */
	public RegraDeCalculo getRegra() {
		return regra;
	}
}
