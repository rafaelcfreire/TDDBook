package br.com.ehnois.chp2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rafaelcfreire
 *
 *         Entidade que representa um carrinho de compras. Retirada do exemplo
 *         do capitulo 2 do Livro TDD - Teste e Design no mundo real
 */
public class CarrinhoDeCompras {

	/**
	 * Lista dos produtos contidos em um carrinho de compras.
	 */
	List<Produto> produtos = new ArrayList<Produto>();

	/**
	 * Acao de adicionar um item ao carrinho de compras.
	 * 
	 * @param produto
	 */
	public void adiciona(Produto produto) {
		this.produtos.add(produto);
	}

	/**
	 * Acao de retornar uma lista com os produtos contidos no carrinho.
	 * 
	 * @return
	 */
	public List<Produto> getProdutos() {
		return produtos;
	}

	/**
	 * Acao de iniciar a lista de produtos do carrinho.
	 * 
	 * @param produtos
	 */
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
}
