package br.com.ehnois.chp5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Rafael_Cassemiro_Fre
 *
 */
public class CarrinhoDeCompras {

	/**
	 * 
	 */
	private List<Item> itens;
	
	public CarrinhoDeCompras() {
		this.itens = new ArrayList<Item>();
	}
	
	/**
	 * @param item
	 */
	public void adiciona(Item item) {
		this.itens.add(item);
	}
	
	/**
	 * @return
	 */
	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
	

	/**
	 * @return
	 */
	public double maiorValor() {
		if (getItens().isEmpty())
			return 0;
		
		double maior = getItens().get(0).getValorTotal();
		
		for (Item item : getItens()) {
			if(maior < item.getValorTotal()) {
				maior = item.getValorTotal();
			}
		}

		return maior;
	}
	
}
