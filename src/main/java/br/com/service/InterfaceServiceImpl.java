package br.com.service;


import br.com.dao.LoginDaoImpl;
import br.com.model.Login;

public class InterfaceServiceImpl{
	
	public InterfaceServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	public Login logar(Login user) {
		//aqui voce implementa a lógica do login
		if (user.getUsuario().equalsIgnoreCase("usuario")) {
			LoginDaoImpl dao = new LoginDaoImpl();
			dao.logar(user);
		}
		return null;
	}

}
