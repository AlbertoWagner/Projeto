package models;

import java.util.*;

public class Diretorio {
	private String nome = "Meu Diretorio";
	private ArrayList arquivos = new ArrayList();
	
	public Diretorio(){
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean adicionarArquivo(Arquivo arquivo){
		arquivos.add(arquivo);
		return true;
	}
	
	public boolean removerArquivo(Arquivo arquivo){
		arquivos.remove(arquivo);
		return true;
	}
	
	//Por enquanto so renomear o arquivo
	public void editarArquivo(Arquivo arquivo, String nome){
		arquivo.setNome(nome);
	}
	
	public void criarPasta(String nome){
		Diretorio novoDir = new Diretorio(nome);
		arquivos.add(novoDir);
	}
	
	//Por enquanto esse nao
//	public void mover(saida, destino){
//		add(destino)
//		remove(saida)
//	}
	
}
