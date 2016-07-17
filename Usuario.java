package models;

import java.util.*;
//Classe usuario onde são definidas os parametros de usuario, senha e email

public class Usuario {
	private String username;
	private String senha;
	private String email;
	Arquivo arquivo = new Arquivo();
	Diretorio diretorioPrincipal = new Diretorio();
	// Construtor
	public Usuario(String username, String senha, String email){
		this.username = username;
		this.senha = senha;
		this.email = email;
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
	
	public void setEmail(String email) {
		this.email = email;
	}
	// Getters & Setters - End
}
