
public class Main {

	static int summe;

	public static void main(String[] args) {
		System.out.println("Main wird ausgefuehrt");
		for (int i = 0; i < args.length; i++) {
			try {
				summe = summe + Integer.parseInt(args[i]);
			} catch (NumberFormatException e) {
				System.out.println("Ungültiger Wert " + args[i] + " festgestellt, wird uebersprungen");
			}
		}
		System.out.println("Die Summe lautet: " + summe);
		System.out.println("Main wurde beendet");
	}

}
