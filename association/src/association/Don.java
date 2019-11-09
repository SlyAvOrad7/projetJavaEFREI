package association;

import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Don {
	
	private final List<Don> dons;

	private String receptionDate;
	private String descriptionComp;
	private String adress; // Enlever un e pour rendre plus anglophone.
	private String tel;
	private String objRef; // Chang� to String.
	private String type;
	private String name; // Rajout du  nom et du t�l�phone.
	private String phone;
	
	private boolean accepted;
	
	private String[] questions = {"Quel type d'objet souhaitez vous donner ? ","Pouvez-vous d�crire plus pr�cisemment l'objet ? ", "Quelle est la r�f�rence de l'objet ? ", "Quel est votre nom ? ","Quelle est votre adresse ? ", "Votre num�ro de t�l�phone ? " };

	
	public Don() {
		
		dons = new ArrayList<Don>();
		

	}

	public void add(Don don){
		dons.add(don);
	}
	
	public void create() {

		Scanner infosdons = new Scanner(System.in);
		System.out.println(questions[0]);
		type =infosdons.nextLine();
		System.out.println(questions[1]);
		descriptionComp =infosdons.nextLine();
		System.out.println(questions[2]);
		objRef =infosdons.nextLine();
		System.out.println(questions[3]);
		name =infosdons.nextLine();
		System.out.println(questions[4]);
		adress =infosdons.nextLine();
		System.out.println(questions[5]);
		phone =infosdons.nextLine();
		
	
	}
	
	public void status() {
		
		boolean verif = false;
			
		while (verif == false) {
			
	// On v�rifie que l'utilisateur de l'application souhaite ou non accepter le don. Par entr�e des bool�ens true ou false
	// On fait �galement un try catch, de fa�on � ce que si l'utilisateur rentre une commande autre que true ou false on r�p�te l'op�ration du choix d'acceptation.
			
			try {
	
				Scanner acceptation = new Scanner(System.in);
				System.out.println("Le don que M|Mme "+ name+ " souhaite faire est un ou une "+ type+ ". Descritpion : " + descriptionComp +". Souhaitez vous l'accepter ? (true pour oui et false pour non)");
				System.out.println();
				accepted = acceptation.nextBoolean();
				acceptation.close();
				verif =true;
				
			}
			catch(InputMismatchException e){
				
				System.out.println("vous n'avez pas fourni au programme une r�ponse ad�quate.");
				System.out.println("Recommen�ons :");
				verif = false;
			}
			
		}
		
		// On informe l'utilisateur du choix qu'il vient de faire.
		
		if (accepted) {
			System.out.println("Vous avez d�cid� d'accepter le don");
		}
		else {
			System.out.println("Le don est refus�");
		}
		
		
	}
	
	

	public void stock() {
		// TODO - implement Don.stock
		throw new UnsupportedOperationException();
	}

	public void transfer() {
		// TODO - implement Don.transfer
		throw new UnsupportedOperationException();
	}

	public void archive() {
		// TODO - implement Don.archive
		throw new UnsupportedOperationException();
	}

	public String getReceptionDate() {
		return receptionDate;
	}

	public void setReceptionDate(String receptionDate) {
		this.receptionDate = receptionDate;
	}

	public String getDescriptionComp() {
		return descriptionComp;
	}

	public void setDescriptionComp(String descriptionComp) {
		this.descriptionComp = descriptionComp;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getObjRef() {
		return objRef;
	}

	public void setObjRef(String objRef) {
		this.objRef = objRef;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isAccepted() {
		return accepted;
	}

	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}

}