package br.com.ehnois.chp8;

import java.util.Calendar;

/**
 * @author Rafael_Cassemiro_Fre
 *
 */
public class GeradorDeNotaFiscal {
	
	private NFDao dao;

	public GeradorDeNotaFiscal(NFDao dao) {
		this.dao = dao;
	}

	public NotaFiscal gera(Pedido pedido) {
		NotaFiscal nf = new NotaFiscal(
				pedido.getCliente(), 
				pedido.getValorTotal() * 0.94, 
				Calendar.getInstance());

		dao.persiste(nf);

		return nf;
	}
}
