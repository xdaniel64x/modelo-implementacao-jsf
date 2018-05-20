package br.com.utils;

import br.com.controler.ControlerShow;

public class BeanLocator {
	
	
	private final static String BEAN_CONTROLE_SHOW = "controlerShow";
	
	public BeanLocator() {
		// TODO Auto-generated constructor stub
	}
	
	public static ControlerShow getControlerShow () {
		return (ControlerShow) ManageBeansUtils.getBeanSession(BEAN_CONTROLE_SHOW, ControlerShow.class);
	}

	

}
