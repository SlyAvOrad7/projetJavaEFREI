package association;

import java.util.ArrayList;
import java.util.List;

public class People extends Don {

	public People(String type, String descriptionComp, String adresse, String tel, int objRef, String receptionDate) {
		super();
		// TODO Auto-generated constructor stub
	}

	public final List<String> donators = new ArrayList<>();
	public final List<String> members = new ArrayList<>();
	
	private String nom;
	private String phone;
	private String adresse;
	private String role;

	public void deletePeople() {
		// TODO - implement People.deletePeople
		throw new UnsupportedOperationException();
	}

	public void changePeople() {
		// TODO - implement People.changePeople
		throw new UnsupportedOperationException();
	}

	public void operation() {
		// TODO - implement People.operation
		throw new UnsupportedOperationException();
	}

}