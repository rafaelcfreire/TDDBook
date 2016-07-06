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
		if (funcionario.getCargo().equals(Cargo.DESENVOLVEDOR)){
			if (funcionario.getSalario() > 3000)
				return funcionario.getSalario() * 0.8;
			return funcionario.getSalario() * 0.9;
		}
		return funcionario.getSalario() * 0.85;
	}
}
