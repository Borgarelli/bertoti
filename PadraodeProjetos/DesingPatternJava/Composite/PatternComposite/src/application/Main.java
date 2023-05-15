package application;

import models.entities.Garçom;
import models.entities.Chefe;
import models.interfaces.CardapioComponent;

public class Main {

	public static void main(String[] args) {
		CardapioComponent garçom = new Garçom("Borgarelli");
		CardapioComponent chefe = new Chefe();
		
		chefe.adcionar(garçom);
		chefe.getNome();
	}

}
