package models.entities;

import java.util.ArrayList;
import java.util.List;

import models.interfaces.CardapioComponent;

public abstract class GestorComposite implements CardapioComponent{
	
	private String nome;
	
	private List<CardapioComponent> list = new ArrayList<>();
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<CardapioComponent> getList() {
		return list;
	}

	public void setList(List<CardapioComponent> list) {
		this.list = list;
	}

	public void adcionar(CardapioComponent lanche) {
		this.list.add(lanche);
		
	}

	@Override
	public void remover(CardapioComponent lanche) {
		this.list.remove(lanche);
		
	}

}
