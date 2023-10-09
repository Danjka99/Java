package de.auto;

public class Fuhrpark {

	public static void main(String[] args) {
		
		Auto toyota = new Auto();
		toyota.kennzeichen = "RO-BY-666";
		toyota.anzahlTueren = 4;
		toyota.farbe = "schwarz";
		toyota.modell = "Mark II";
		
		System.out.println("Toyota: " + toyota);
		
		Auto honda = new Auto();
		honda.kennzeichen = "RO-TP-808";
		honda.anzahlTueren = 4;
		honda.farbe = "weiss";
		honda.modell = "S2000";
		
		System.out.println("Honda: " + honda);

	}

}
