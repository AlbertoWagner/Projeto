package models;

import java.util.*;

public class Sistema {
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	
	//Metodos
	public void cadastrar(String nome, String senha, String email){
		if(!jaExiste(nome)){
			Usuario novoUsuario = new Usuario(nome, senha, email);
			usuarios.add(novoUsuario);
		}
	}
	
	public boolean autenticar(String nome, String senha){
		for (int i = 0; i < usuarios.size(); i++) {
			if (usuarios.get(i).getUsername() == nome && usuarios.get(i).getSenha() == senha) {
				return true;
			}
		}
		return false;
	}
	
	public boolean jaExiste(String nome){
		for (int i = 0; i < usuarios.size(); i++) {
			if (usuarios.get(i).getUsername() == nome) {
				return true;
			}
		}
		return false;
	}
}
