package association;


import java.util.ArrayList;
import java.util.List;
import java.io.*; // Importation de la blibliothèque nécessaire pour écrire et lire sur un fichier.

public class Main {
	



	public static void main(String[] args) throws IOException{
		
		FileWriter dWriter = new FileWriter("donations.txt", true); // Commandes qui nous permettent d'ouvrir un fichier déjà existant puis de pouvoir y écrire du contenu.
		PrintWriter donations = new PrintWriter(dWriter);

		
		List<Don> dons = new ArrayList<Don>();  // On crée un tableau qui va contenir tous les dons effectués. A partir de chaque don on peut accéder à ses attributs.
		Don newDon = new Don(); // On suppose qu'a chaque fois que l'on lance le programme on crée un nouveau don.
		newDon.create(); // Avec la fonction create on va recueillir des informations sur le don que la pesonne souhaite effectuer.
		dons.add(newDon); // On ajoute ce dons à le liste qui ve stocker tous les dons.
		
		//System.out.println(dons.get(0).getType());
		newDon.status(); // Fonction status de la classe Don qui nous permet de determiner si le don est accepé ou non.
		Archives.StatusDonation(newDon.isAccepted(),newDon.getObjRef());

		//donations.println(dons.size()+ ". " + newDon.getType()+ "; "+ newDon.getObjRef() + "; " + newDon.getName());
		// donations.close();
		
		
		
		
		// Satistiques
		System.out.println(Archives.acceptedD); // On cherche à avoir la liste qui contient les références des dons acceptés.

	}

}
