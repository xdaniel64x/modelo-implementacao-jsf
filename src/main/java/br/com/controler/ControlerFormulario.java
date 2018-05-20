package br.com.controler;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.model.Login;
import br.com.service.InterfaceServiceImpl;
import br.com.utils.BeanLocator;
import br.com.utils.ManageBeansUtils;

@ManagedBean
@SessionScoped
public class ControlerFormulario {
	
	private Login login = null;
	
	

	public ControlerFormulario() {
		login = new Login();
	}
	
	public String navegar () {
		
		ControlerShow beanShow = BeanLocator.getControlerShow();
		
		ManageBeansUtils.removeBeanInSession();
		
		return beanShow.iniciarPagina(login);
	}
	
	public String logar() {
		InterfaceServiceImpl service = new InterfaceServiceImpl();
		service.logar(login);
		return BeanLocator.getControlerShow().iniciarPagina(login);
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	

}
