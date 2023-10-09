package de.mathematik;

import java.util.Random;

public class MathOperations {
	
	public int berechneZufallszahl() {
		Random zufall = new Random();
		int obergrenze = 10;
		int untergrenze = 1;
		int zufallszahl = zufall.nextInt(obergrenze - untergrenze) + untergrenze;
		return zufallszahl;
	}
	
}
