import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {	
		argsNull(args);
		if (argsNull(args) == true) {
			System.out.println("Fehler, keine Eingabe");
			System.exit(1);
		}
		argsZeroIsValid(args[0]);
		if (argsZeroIsValid(args[0]) == false) {
			System.out.println("Fehler, erste Eingabe ist kein Pfad");
			System.exit(2);
		}
		validOutput(args[0]);
		if (validOutput(args[0]) == false) {
			System.out.println("Fehler, Datei ist nicht vorhanden");
			System.exit(2);
		}
		validContent(args[0]);
		if (validContent(args[0]) == false) {
			System.out.println("Fehler, kein Inhalt vorhanden");
		}
		contentOutput(args[0]);
	}
	
	public static boolean argsNull(String args[]) {
		if (args.length > 0 || args == null) return false;
		else return true;
	}
	
	public static boolean argsZeroIsValid(String path) {
		try {

            Paths.get(path);

        } catch (InvalidPathException ex) {
            return false;
        }
        return true;
	}
	
	public static boolean validOutput(String datei) {
		File f = new File(datei);
		if(f.exists() && !f.isDirectory()) { 
		    return true;
		}
		return false;
	}
	
	public static boolean validContent(String datei) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(datei));
            if (br.readLine() == null) {
                return false;
            }
        } catch (IOException e) {
            return false;
        }
		return true;
	}
	
	public static void contentOutput(String datei) {
		
	}

}
