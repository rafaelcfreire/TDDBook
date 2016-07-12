package br.com.ehnois.chp2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rafaelcfreire
 *
 */
public class CarrinhoDeCompras {

	/**
	 * 
	 */
	List<Produto> produtos = new ArrayList<Produto>();

	/**
	 * @param produto
	 */
	public void adiciona(Produto produto) {
		this.produtos.add(produto);
	}

	/**
	 * @return
	 */
	public List<Produto> getProdutos() {
		return produtos;
	}

	/**
	 * @param produtos
	 */
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
}
