package br.com.ehnois.chp3.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.ehnois.chp3.ConversorDeNumeroRomano;

/**
 * @author Rafael_Cassemiro_Fre
 *
 */
public class ConversorDeNumeroRomanoTest {

	/**
	 * 
	 */
	@Test
	public void deveEntenderOSimboloI() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("I");
		Assert.assertEquals(1, numero);
	}

	/**
	 * 
	 */
	@Test
	public void deveEntenderOSimboloV() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("V");
		Assert.assertEquals(5, numero);
	}

	/**
	 * 
	 */
	@Test
	public void deveEntenderDoisSimbolosComoII() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("II");
		Assert.assertEquals(2, numero);
	}

	/**
	 * 
	 */
	@Test
	public void deveEntenderQuatroSimbolosDoisADoisComoXXII() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("XXII");
		Assert.assertEquals(22, numero);
	}

	/**
	 * 
	 */
	@Test
	public void deveEntenderNumerosComoIX() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("IX");
		Assert.assertEquals(9, numero);
	}
	
	/**
	 * 
	 */
	@Test
	public void deveEntenderNumerosComplexosComoXXIV() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("XXIV");
		Assert.assertEquals(24, numero);
	}	
}
