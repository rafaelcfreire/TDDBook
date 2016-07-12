package br.com.ehnois.chp8.test;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import br.com.ehnois.chp8.GeradorDeNotaFiscal;
import br.com.ehnois.chp8.NFDao;
import br.com.ehnois.chp8.NotaFiscal;
import br.com.ehnois.chp8.Pedido;

public class GeradorDeNotaFiscalTest {

	@Test
	public void deveGerarNFComValorDeImpostosDescontado() {
		//criacao do mock
		NFDao dao = Mockito.mock(NFDao.class);
		
		GeradorDeNotaFiscal gerador = new GeradorDeNotaFiscal(dao);
		Pedido pedido = new Pedido("Mauricio", 1000, 1);
		
		NotaFiscal nf = gerador.gera(pedido);
		
		Assert.assertEquals(1000 * 0.94, nf.getValor(), 0.0001);
	}

	@Test
	public void devePersistirNFGerada() {
		//criacao do mock
		NFDao dao = Mockito.mock(NFDao.class);

		GeradorDeNotaFiscal gerador = new GeradorDeNotaFiscal(dao);
		Pedido pedido = new Pedido("Mauricio", 1000, 1);

		NotaFiscal nf = gerador.gera(pedido);

		Mockito.verify(dao).persiste(nf);
	}

}
