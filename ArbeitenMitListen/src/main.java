import java.util.ArrayList;
import java.time.LocalDateTime;

public class main {
	
	static int uhrzeit;
	
	int uhrzeitOffiziell;
	
	static ArrayList<String> begruessung = new ArrayList<String>();

	public static void main(String[] args) {	
		main instance = new main();
		arrayInit();
		try {
			uhrzeitInit(args[0]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			instance.aktuelleZeit();
		}
	}

	public static void arrayInit() {
		begruessung.add("Guten Morgen");
		begruessung.add("Mahlzeit");
		begruessung.add("Guten Abend");
	}
	
	public static void uhrzeitInit(String wert) {
		uhrzeit = Integer.parseInt(wert);
		ausgabe();
	}
	
	public static void ausgabe() {
		if(uhrzeit <= 11) {
			System.out.println(begruessung.get(0));
		}
		else if(uhrzeit > 11 && uhrzeit <= 14) {
			System.out.println(begruessung.get(1));
		}
		else if(uhrzeit > 14 && uhrzeit <= 23) {
			System.out.println(begruessung.get(2));
		}
	}
	
	public void aktuelleZeit() {
		LocalDateTime zeit = LocalDateTime.now();
		uhrzeitOffiziell = zeit.getHour();
		ausgabeAktuelleZeit();
	}
	
	public void ausgabeAktuelleZeit() {
		if(uhrzeitOffiziell <= 11) {
			System.out.println(begruessung.get(0));
		}
		else if(uhrzeitOffiziell > 11 && uhrzeitOffiziell <= 14) {
			System.out.println(begruessung.get(1));
		}
		else if(uhrzeitOffiziell > 14 && uhrzeitOffiziell <= 23) {
			System.out.println(begruessung.get(2));
		}
	}

}
