package de.user;

import java.util.ArrayList;

public class User {

	ArrayList<Object> userData = new ArrayList<>();

	public String forname;
	public String lastname;
	public String email;

	public void saveUserData(Object benutzer) {
		userData.add(benutzer);
	}
	
	public void userDataOutput() {
		for (Object o : userData) {
			System.out.println(o);
		}
	}

	@Override
	public String toString() {
        return "   Forname = " + this.forname 
                + "    Lastname = " + this.lastname 
                + "    Email = "
                + this.email; 
	}
}
