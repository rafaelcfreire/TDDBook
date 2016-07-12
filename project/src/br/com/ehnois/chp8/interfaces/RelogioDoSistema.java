package br.com.ehnois.chp8.interfaces;

import java.util.Calendar;

/**
 * @author Rafael_Cassemiro_Fre
 *
 */
public class RelogioDoSistema implements Relogio {

	@Override
	public Calendar hoje() {
		return Calendar.getInstance();
	}

}
