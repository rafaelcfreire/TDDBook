package br.com.ehnois.chp7;

import br.com.ehnois.chp4.Funcionario;

/**
 * Interface que define as regras de calculo de descontos de salarios,
 * refactoring do codigo do cap 4.
 * 
 * @author Rafael_Cassemiro_Fre
 *
 */
public abstract class RegraDeCalculo {

	/**
	 * @param f
	 * @return
	 */
	public double calcula(Funcionario funcionario) {
		if (funcionario.getSalario() > limite()) {
			return funcionario.getSalario() * porcentagemAcimaDoLimite();
		}
		return funcionario.getSalario() * porcentagemBase();
	}

	/**
	 * @return
	 */
	protected abstract int limite();

	/**
	 * @return
	 */
	protected abstract double porcentagemAcimaDoLimite();
	
	/**
	 * @return
	 */
	protected abstract double porcentagemBase();
	
}
