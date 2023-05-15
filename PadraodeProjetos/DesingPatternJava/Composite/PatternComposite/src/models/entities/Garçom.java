package models.entities;

import java.util.ArrayList;
import java.util.List;

import models.interfaces.CardapioComponent;

public class Garçom implements CardapioComponent {

	private String nome;
	private List<CardapioComponent> list = new ArrayList<>();

	public Garçom(String nome) {
		this.nome = nome;
	}

	@Override
	public void adcionar(CardapioComponent lanche) {
		this.list.add(lanche);
	}

	@Override
	public void remover(CardapioComponent lanche) {
		this.list.remove(lanche);

	}

	@Override
	public String getNome() {
		return nome;
	}

}
