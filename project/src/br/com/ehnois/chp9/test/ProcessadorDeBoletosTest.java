package br.com.ehnois.chp9.test;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.ehnois.chp9.Boleto;
import br.com.ehnois.chp9.Fatura;
import br.com.ehnois.chp9.ProcessadorDeBoletos;

/**
 * @author Rafael_Cassemiro_Fre
 *
 */
public class ProcessadorDeBoletosTest {

	@Test
	public void deveProcessarPagamentoViaBoletoUnico() {
		ProcessadorDeBoletos processador = new ProcessadorDeBoletos();

		Fatura fatura = new Fatura("Cliente", 150.0);
		Boleto b1 = new Boleto(150.0);
		List<Boleto> boletos = Arrays.asList(b1);

		processador.processa(boletos, fatura);

		Assert.assertEquals(1, fatura.getPagamentos().size());
		Assert.assertEquals(150.0, fatura.getPagamentos().get(0).getValor(), 0.00001);
	}

	@Test
	public void deveProcessarPagamentoViaMuitosBoletos() {
		ProcessadorDeBoletos processador = new ProcessadorDeBoletos();

		Fatura fatura = new Fatura("Cliente", 300.0);
		Boleto b1 = new Boleto(100.0);
		Boleto b2 = new Boleto(200.0);
		List<Boleto> boletos = Arrays.asList(b1, b2);

		processador.processa(boletos, fatura);

		Assert.assertEquals(2, fatura.getPagamentos().size());
		Assert.assertEquals(100.0, fatura.getPagamentos().get(0).getValor(), 0.00001);
		Assert.assertEquals(200.0, fatura.getPagamentos().get(1).getValor(), 0.00001);
	}
	
	@Test
	public void deveMarcarFaturaComoPagaCasoBoletoUnicoPagueTudo() {
		ProcessadorDeBoletos processador = new ProcessadorDeBoletos();
		
		Fatura fatura = new Fatura("Cliente", 150.0);
		Boleto b1 = new Boleto(150.0);
		List<Boleto> boletos = Arrays.asList(b1);
		
		processador.processa(boletos, fatura);
		
		Assert.assertTrue(fatura.isPago());
	}	

}
