package de.userverwaltung;

import de.user.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("Main wird ausgeführt");

		User user = new User();

		User benutzer1 = new User();

		benutzer1.forname = "Daniel";
		benutzer1.lastname = "Jakob";
		benutzer1.email = "123@123.de";

		user.saveUserData(benutzer1);

		User benutzer2 = new User();

		benutzer2.forname = "David";
		benutzer2.lastname = "Wagner";
		benutzer2.email = "234@234.de";

		user.saveUserData(benutzer2);
		
		user.userDataOutput();
		
		System.out.println("Main wird beendet");

	}

}
