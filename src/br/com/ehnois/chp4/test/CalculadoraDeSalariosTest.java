package br.com.ehnois.chp4.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.ehnois.chp4.CalculadoraDeSalario;
import br.com.ehnois.chp4.Cargo;
import br.com.ehnois.chp4.Funcionario;

public class CalculadoraDeSalariosTest {

	@Test
	public void deveCalcularSalarioParaDesenvolvedoresComSalarioAbaixoDoLimite() {
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
		Funcionario desenvolvedor = new Funcionario("Mauricio", 1500.0, Cargo.DESENVOLVEDOR);

		double salario = calculadora.calculaSalario(desenvolvedor);

		Assert.assertEquals(1500.0 * 0.9, salario, 0.00001);
	}

	@Test
	public void	deveCalcularSalarioParaDesenvolvedoresComSalarioAcimaDoLimite() {
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
		Funcionario desenvolvedor = new Funcionario("Mauricio", 4000.0, Cargo.DESENVOLVEDOR);

		double salario = calculadora.calculaSalario(desenvolvedor);

		Assert.assertEquals(4000.0 * 0.8, salario, 0.00001);
	}

	@Test
	public void deveCalcularSalarioParaDBAsComSalarioAbaixoDoLimite() {
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
		Funcionario desenvolvedor = new Funcionario("Mauricio", 500.0, Cargo.DBA);

		double salario = calculadora.calculaSalario(desenvolvedor);

		Assert.assertEquals(500.0 * 0.85, salario, 0.00001);
	}
	
	@Test
	public void deveCalcularSalarioParaDBAsComSalarioAcimaDoLimite() {
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
		Funcionario desenvolvedor = new Funcionario("Mauricio", 4500.0, Cargo.DBA);

		double salario = calculadora.calculaSalario(desenvolvedor);

		Assert.assertEquals(4500.0 * 0.75, salario, 0.00001);
	}
}
