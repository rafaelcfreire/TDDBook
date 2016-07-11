package br.com.ehnois.chp5.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.ehnois.chp5.CarrinhoDeCompras;
import br.com.ehnois.chp5.Item;

public class CarrinhoDeCompraTest {
	
	/**
	 * 
	 */
	private CarrinhoDeCompras carrinho;

	@Before
	public void inicializa() {
		this.carrinho = new CarrinhoDeCompras();
	}

	@Test
	public void deveRetornarZeroSeCarrinhoVazio() {
		Assert.assertEquals(0.0, carrinho.maiorValor(), 0.0001);
	}

	@Test
	public void deveRetornarValorDoItemSeCarrinhoCom1Element() {
		carrinho.adiciona(new Item("Geladeira", 1, 900.0));
		Assert.assertEquals(900.0, carrinho.maiorValor(), 0.0001);
	}

	@Test
	public void deveRetornarMaiorValorSeCarrinhoContemMuitosElementos() {
		carrinho.adiciona(new Item("Geladeira", 1, 900.0));
		carrinho.adiciona(new Item("Fogao", 1, 1500.0));
		carrinho.adiciona(new Item("Maquina de Lavar", 1, 750.0));

		Assert.assertEquals(1500.0, carrinho.maiorValor(), 0.0001);
	}

}
