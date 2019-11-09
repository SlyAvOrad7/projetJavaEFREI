package association;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Archives {

	public final static List<String> refusedD = new ArrayList<>();
	public final static List<String> acceptedD = new ArrayList<>();
	
	public static void StatusDonation (boolean status, String ref) {
		if (status) {
			AcceptedDonation(ref);
		}
		else {
			RefusedDonation(ref);
		}
	}

	public static void AcceptedDonation(String ref) {
		
		String wish;
		
		System.out.println("Le don peu");
		
		acceptedD.add(ref);

	}

	public static void RefusedDonation(String ref) throws IOException {
		
		refusedD.add(ref);
		FileWriter dWriter = new FileWriter("donationsRefused.txt", true); // Commandes qui nous permettent d'ouvrir un fichier déjà existant puis de pouvoir y écrire du contenu.
		PrintWriter donationsR = new PrintWriter(dWriter);
		donationsR.println(ref);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
