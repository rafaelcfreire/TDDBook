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

		for (Boleto boleto : boletos) {
			fatura.adicionaPagamento(new Pagamento(boleto.getValor(), MeioDePagamento.BOLETO));
		}
	}
	
}
