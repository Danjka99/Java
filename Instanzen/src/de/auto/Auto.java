package de.auto;

public class Auto {
	
	public String modell;
	public int anzahlTueren;
	public String farbe;
	public String kennzeichen;
	
	@Override
	public String toString() {
		return "Modell - " + modell + " Türen - " + anzahlTueren + " Farbe - " + farbe + " Kennzeichen - " + kennzeichen;
	}

}
