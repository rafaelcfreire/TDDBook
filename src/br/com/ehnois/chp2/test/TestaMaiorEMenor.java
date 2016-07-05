package br.com.ehnois.chp2.test;

import org.junit.Test;

import br.com.ehnois.chp2.CarrinhoDeCompras;
import br.com.ehnois.chp2.MaiorEMenor;
import br.com.ehnois.chp2.Produto;
import org.junit.Assert;

public class TestaMaiorEMenor {

	@Test
	public void ordemDecrescente() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Produto("Geladeira", 450.0));
		carrinho.adiciona(new Produto("Liquidificador", 250.0));
		carrinho.adiciona(new Produto("Jogo de pratos", 70.0));

		MaiorEMenor algoritmo = new MaiorEMenor();
		algoritmo.encontra(carrinho);

		Assert.assertEquals("Jogo de pratos", algoritmo.getMenor().getNome());
		Assert.assertEquals("Geladeira", algoritmo.getMaior().getNome());
	}
	
	@Test
	public void testaApenasUmProduto() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Produto("Geladeira", 450.0));

		MaiorEMenor algoritmo = new MaiorEMenor();
		algoritmo.encontra(carrinho);

		Assert.assertEquals("Geladeira", algoritmo.getMenor().getNome());
		Assert.assertEquals("Geladeira", algoritmo.getMaior().getNome());

	}

}
