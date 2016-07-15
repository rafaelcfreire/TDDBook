package br.com.ehnois.chp6;

import br.com.ehnois.chp5.CarrinhoDeCompras;
import br.com.ehnois.chp5.Item;

/**
 * Test Data Builder criado para facilitar manipulacao de itens no carrinho de
 * compras.
 * 
 * @author Rafael_Cassemiro_Fre
 *
 */
public class CarrinhoDeComprasBuilder {

	/**
	 * 
	 */
	public CarrinhoDeCompras carrinhoDeCompras;

	public CarrinhoDeComprasBuilder(CarrinhoDeCompras carrinhoDeCompras) {
		this.carrinhoDeCompras = carrinhoDeCompras;
	}

	public CarrinhoDeComprasBuilder comItens(double... valores) {
		for (double valor : valores) {
			carrinhoDeCompras.adiciona(new Item("item", 1, valor));
		}
		return this;
	}

	public CarrinhoDeCompras cria() {
		return carrinhoDeCompras;
	}
}