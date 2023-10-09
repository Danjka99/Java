package de.ifbrosenheim;

import de.mathematik.*;

public class zahlenGenerator {

	public static void main(String[] args) {
		MathOperations mathOperations = new MathOperations();
		System.out.println("Zahl zwischen 1 - 10 : " + mathOperations.berechneZufallszahl());
	}

}
