package br.com.ehnois.chp9;

import java.util.List;

/**
 * @author Rafael_Cassemiro_Fre
 *
 */
public class ProcessadorDeBoletos {

	/**
	 * @param boletos
	 * @param fatura
	 */
	public void processa(List<Boleto> boletos, Fatura fatura) {
		double valorTotal = 0;

		for (Boleto boleto : boletos) {
			fatura.getPagamentos().add(new Pagamento(boleto.getValor(), MeioDePagamento.BOLETO));
			valorTotal += boleto.getValor();
		}

		if (valorTotal >= fatura.getValor()) {
			fatura.setPago(true);
		}
	}
	
}
