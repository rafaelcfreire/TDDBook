package br.com.ehnois.chp5.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.ehnois.chp5.CarrinhoDeCompras;
import br.com.ehnois.chp5.Item;

public class MaiorPrecoTest {

	@Test
	public void deveRetornarZeroSeCarrinhoVazio() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		Assert.assertEquals(0.0, carrinho.maiorValor(), 0.0001);
	}

	@Test
	public void deveRetornarValorDOItemSeCarrinhoCom1Element() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Item("Geladeira", 1, 900.0));

		Assert.assertEquals(900.0, carrinho.maiorValor(), 0.0001);
	}

	@Test
	public void deveRetornarMaiorValorSeCarrinhoContemMuitosElementos() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Item("Geladeira", 1, 900.0));
		carrinho.adiciona(new Item("Fogao", 1, 1500.0));
		carrinho.adiciona(new Item("Maquina de Lavar", 1, 750.0));

		Assert.assertEquals(1500.0, carrinho.maiorValor(), 0.0001);
	}

}
