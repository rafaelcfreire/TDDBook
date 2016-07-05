package br.com.ehnois.chp2;

/**
 * @author rafaelcfreire
 *
 */
public class MaiorEMenor {
	
	/**
	 * 
	 */
	private Produto menor;
	
	/**
	 * 
	 */
	private Produto maior;

	/**
	 * @return
	 */
	public Produto getMenor() {
		return menor;
	}

	/**
	 * @return
	 */
	public Produto getMaior() {
		return maior;
	}

	/**
	 * @param carrinho
	 */
	public void encontra(CarrinhoDeCompras carrinho) {
		for(Produto produto : carrinho.getProdutos()) {
			if(menor == null || produto.getValor() < menor.getValor()) {
				menor = produto;
			}
			if (maior == null || produto.getValor() > maior.getValor()) {
				maior = produto;
			}
		}		
	}
}
