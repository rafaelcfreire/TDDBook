package br.com.ehnois.chp8;

import java.util.List;

import br.com.ehnois.chp8.interfaces.AcaoAposGerarNota;
import br.com.ehnois.chp8.interfaces.Relogio;
import br.com.ehnois.chp8.interfaces.Tabela;

/**
 * @author Rafael_Cassemiro_Fre
 *
 */
public class GeradorDeNotaFiscal {
	
	/**
	 * 
	 */
	private final List<AcaoAposGerarNota> acoes;
	
	/**
	 * 
	 */
	private final Relogio relogio;

	/**
	 * 
	 */
	private Tabela tabela;

	public GeradorDeNotaFiscal(List<AcaoAposGerarNota> acoes, Relogio relogio, Tabela tabela) {
		this.acoes = acoes;
		this.relogio = relogio;
		this.tabela = tabela;
	}

	/**
	 * @param pedido
	 * @return
	 */
	public NotaFiscal gera(Pedido pedido) {
		NotaFiscal nf = new NotaFiscal(
				pedido.getCliente(), 
				pedido.getValorTotal() * tabela.paraValor(pedido.getValorTotal()), 
				relogio.hoje());

		for (AcaoAposGerarNota acao : acoes) {
			acao.executa(nf);
		}

		return nf;
	}
}
