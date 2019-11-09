package association;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Questionnaire {

	private final List<Questionnaire> dons;
	
	private String type;
	private String description;
	private String ref;
	private String name;
	private String adress;
	private String phone;
	

	
	private String[] questions = {"Quel type d'objet souhaitez vous donner ? ","Pouvez-vous décrire plus précisemment l'objet ? ", "Quelle est la référence de l'objet ? ", "Quel est votre nom ? ","Quelle est votre adresse ? ", "Votre numéro de téléphone ? " };


	
	public Questionnaire() {
		

		
		dons = new ArrayList<Questionnaire>();
					
		
	}
	
	
	public void add(Questionnaire don){
		dons.add(don);
	}
	
/*	
	public void form() {
		
		Scanner infosdons = new Scanner(System.in);
		
		for (int i=0 ; i < questions.length ; i++) {
			
			System.out.println(questions[i]);
			String ans = infosdons.next();
			answers[i]=ans;
			
		}
		
		//System.out.println(Arrays.toString(answers));
		
		infosdons.close();
		

	}
*/
	//String type, String description, String ref, String name, String adress, String phone
	
	public void form() {
		
		Scanner infosdons = new Scanner(System.in);
		System.out.println(questions[0]);
		type =infosdons.nextLine();
		System.out.println(questions[1]);
		description =infosdons.nextLine();
		System.out.println(questions[2]);
		ref =infosdons.nextLine();
		System.out.println(questions[3]);
		name =infosdons.nextLine();
		System.out.println(questions[4]);
		adress =infosdons.nextLine();
		System.out.println(questions[5]);
		phone =infosdons.nextLine();
		infosdons.close();
		
		}


	
	@Override
	public String toString() {
		return "Loulou";
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getRef() {
		return ref;
	}


	public void setRef(String ref) {
		this.ref = ref;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	
}
