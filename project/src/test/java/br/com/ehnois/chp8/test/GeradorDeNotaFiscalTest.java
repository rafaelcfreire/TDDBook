package br.com.ehnois.chp8.test;

import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import br.com.ehnois.chp8.GeradorDeNotaFiscal;
import br.com.ehnois.chp8.NotaFiscal;
import br.com.ehnois.chp8.Pedido;
import br.com.ehnois.chp8.interfaces.AcaoAposGerarNota;
import br.com.ehnois.chp8.interfaces.Relogio;
import br.com.ehnois.chp8.interfaces.RelogioDoSistema;
import br.com.ehnois.chp8.interfaces.Tabela;

public class GeradorDeNotaFiscalTest {

	@Test
	public void deveConsultarATabelaParaCalcularValor() {
		// mockando uma tabela, que ainda nem existe
		Tabela tabela = Mockito.mock(Tabela.class);

		Relogio relogioDoSistema = new RelogioDoSistema();
		
		// definindo o futuro comportamento "paraValor",
		// que deve retornar 0.2 caso o valor seja 1000.0
		Mockito.when(tabela.paraValor(1000.0)).thenReturn(0.2);

		List<AcaoAposGerarNota> nenhumaAcao = Collections.emptyList();		
		GeradorDeNotaFiscal gerador = new GeradorDeNotaFiscal(nenhumaAcao, relogioDoSistema, tabela);
		Pedido pedido = new Pedido("Mauricio", 1000, 1);
		
		NotaFiscal nf = gerador.gera(pedido);
		
		// garantindo que a tabela foi consultada
		Mockito.verify(tabela).paraValor(1000.0);
		Assert.assertEquals(1000 * 0.2, nf.getValor(), 0.00001);		
	}
}
