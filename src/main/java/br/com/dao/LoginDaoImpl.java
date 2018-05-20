package br.com.dao;

import org.springframework.stereotype.Repository;

import br.com.model.Login;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Override
	public Login logar(Login user) {
		//nessa camada você implementa o acesso a base de dados
		if (user.getUsuario().equalsIgnoreCase("usuario")) {
			
		}
		return null;
	}

}
