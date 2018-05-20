package br.com.controler;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.bean.AbstractBackingBean;
import br.com.dao.LoginDao;
import br.com.model.Login;

@ManagedBean
@SessionScoped
public class ControlerShow extends AbstractBackingBean{
	
	private Login login;
	
	
	public ControlerShow() {
	}
	
	public String testar(){
		return null;
	}
	
	
	
	public String iniciarPagina(Login loginParam){
		this.login = loginParam;
		return "show.xhtml";
	}



	public Login getLogin() {
		return login;
	}



	public void setLogin(Login login) {
		this.login = login;
	}
}
