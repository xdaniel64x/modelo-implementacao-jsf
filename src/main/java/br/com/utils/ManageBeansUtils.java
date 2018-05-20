package br.com.utils;

import java.util.ArrayList;
import java.util.List;

import javax.faces.context.FacesContext;

import br.com.bean.AbstractBackingBean;


public class ManageBeansUtils {
	
	
	private static List< String > beanInSession;
	 
	 private static void addBeanInSession(String nameBean, AbstractBackingBean createdBean) {
		 
		 if (beanInSession == null) {
			 beanInSession = new ArrayList<String> ();
		 }
		 
		 
		 AbstractBackingBean bean = (AbstractBackingBean) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get(nameBean);
		 
		 if (bean == null) {
			 //Adiciona Bean na Sessão:
			 FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put(nameBean, createdBean);
			 bean = (AbstractBackingBean) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get(nameBean);
			 beanInSession.add(nameBean);
		 }
		 
	 }

	public static void removeBeanInSession() {
		for (String nameBean: beanInSession) {
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove(nameBean);
		}
		
	}
	
	public static AbstractBackingBean getBeanSession (String nameBean, Class classe) {
		AbstractBackingBean bean = (AbstractBackingBean) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get(nameBean);
		if (bean != null) {
			return bean;
		} 
		
		try {
			bean = (AbstractBackingBean) classe.newInstance();
			addBeanInSession(nameBean, bean);
			return bean;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	

}
