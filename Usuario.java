package models;

import java.util.*;

public class Usuario {
	private String username;
	private String senha;
	private String email;
	Diretorio diretorioPrincipal = new Diretorio();
	
	public Usuario(String username, String senha, String email){
		this.username = username;
		this.senha = senha;
		this.email = email;
	}
	
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
	
	
	
	
	
}
