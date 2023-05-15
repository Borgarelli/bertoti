package models.entities;

import java.util.ArrayList;

import java.util.List;

public class  {
	
	private String nome;
	private String hamburguer;
	private List<Lanche> Lanches = new ArrayList<>();
	
	public Lanche(String nome, String hamburguer) {
		super();
		this.nome = nome;
		this.hamburguer = hamburguer;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String gethamburguer() {
		return hamburguer;
	}
	public void sethamburguer(String hamburguer) {
		this.hamburguer = hamburguer;
	}

	public void add(Lanche func) {
		this.Lanches.add(func);
		
	}
}
