package association;


import java.util.ArrayList;
import java.util.List;
import java.io.*; // Importation de la bliblioth�que n�cessaire pour �crire et lire sur un fichier.

public class Main {
	



	public static void main(String[] args) throws IOException{
		
		FileWriter dWriter = new FileWriter("donations.txt", true); // Commandes qui nous permettent d'ouvrir un fichier d�j� existant puis de pouvoir y �crire du contenu.
		PrintWriter donations = new PrintWriter(dWriter);

		
		List<Don> dons = new ArrayList<Don>();  // On cr�e un tableau qui va contenir tous les dons effectu�s. A partir de chaque don on peut acc�der � ses attributs.
		Don newDon = new Don(); // On suppose qu'a chaque fois que l'on lance le programme on cr�e un nouveau don.
		newDon.create(); // Avec la fonction create on va recueillir des informations sur le don que la pesonne souhaite effectuer.
		dons.add(newDon); // On ajoute ce dons � le liste qui ve stocker tous les dons.
		
		//System.out.println(dons.get(0).getType());
		newDon.status(); // Fonction status de la classe Don qui nous permet de determiner si le don est accep� ou non.
		Archives.StatusDonation(newDon.isAccepted(),newDon.getObjRef());

		//donations.println(dons.size()+ ". " + newDon.getType()+ "; "+ newDon.getObjRef() + "; " + newDon.getName());
		// donations.close();
		
		
		
		
		// Satistiques
		System.out.println(Archives.acceptedD); // On cherche � avoir la liste qui contient les r�f�rences des dons accept�s.

	}

}
