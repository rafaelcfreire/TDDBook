package br.com.ehnois.chp4;

/**
 * @author rafaelcfreire
 *
 */
public class CalculadoraDeSalario {

	/**
	 * @param funcionario
	 * @return
	 */
	public double calculaSalario(Funcionario funcionario) {
		return funcionario.getCargo().getRegra().calcula(funcionario);
	}
}
