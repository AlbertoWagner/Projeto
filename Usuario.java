package models;

import java.util.regex.*;

//Classe usuario onde são definidas os parametros de usuario, senha e email
public class Usuario {
	private String username;
	private String senha;
	private String email;
	Arquivo arquivo = new Arquivo("files");
	Diretorio diretorioPrincipal = new Diretorio();

	// Construtor
	public Usuario(String username, String senha, String email) throws Exception {
		if (isValidUsername(username)) {
			this.username = username;
		} else {
			throw new Exception("Usuario nao atende aos requisitos para ser criado");
		}

		if (senha.length() > 6 && senha.length() < 20) {
			this.senha = senha;
		} else {
			throw new Exception("A senha precisa ter entre 6 e 20 caracteres");
		}

		if (isValidEmail(email)) {
			this.email = email;
		} else {
			throw new Exception("E-mail inserido não é valido");
		}

	}

	// Getters & Setters - Start
	public String getUsername() {
		return username;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	// Getters & Setters - End

	// Metodo para validar o email
	public static boolean isValidEmail(String email) {
		if (email != null) {
			Pattern p = Pattern.compile(
					"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
			Matcher m = p.matcher(email);
			return m.find();
		}
		return false;
	}

	// Metodo para validar o usuario somente se as condiççoes forem atendidas:
	// usuario só pode conter numeros e letras, alem de _ underline, e nao pode
	// comecar com numeros, e precisa ter entre 6 e 20 caracteres
	public static boolean isValidUsername(String user) {
		if (user != null) {
			Pattern p = Pattern.compile("^([A-Za-z_][A-Za-z0-9_]*){6,20}$");
			Matcher m = p.matcher(user);
			return m.find();
		}
		return false;
	}

}
