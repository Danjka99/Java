import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random zufall = new Random();
		int obergrenze = 10;
		int untergrenze = 1;
		int zufallszahl = zufall.nextInt(obergrenze - untergrenze) + untergrenze;
		System.out.println("Zahl zwischen 1 - 10 : " + zufallszahl);
	}

}
