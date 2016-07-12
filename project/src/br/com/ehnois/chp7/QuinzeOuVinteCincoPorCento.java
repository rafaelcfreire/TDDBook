package br.com.ehnois.chp7;

/**
 * Implementacao de regra de descontos do calculo de salarios do cap.4
 * utilizando regra de 15 ou 20 por cento.
 * 
 * @author Rafael_Cassemiro_Fre
 *
 */
public class QuinzeOuVinteCincoPorCento extends RegraDeCalculo {

	@Override
	protected int limite() {
		return 2500;
	}

	@Override
	protected double porcentagemAcimaDoLimite() {
		return 0.75;
	}

	@Override
	protected double porcentagemBase() {
		return 0.85;
	}

}
