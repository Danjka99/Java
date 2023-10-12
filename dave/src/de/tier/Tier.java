package de.tier;

public class Tier {

	public int Alter;
	public String Rasse;
	public String Art;

	public Tier(int tierAlter, String tierRasse, String tierArt) {
		Alter = tierAlter;
		Rasse = tierRasse;
		Art = tierArt;
	}
	
	public static void main(String[] args) {
			Tier hund = new Tier(6,"Schäferhund","Hund");
			System.out.println(hund.Rasse);
	}
	
}