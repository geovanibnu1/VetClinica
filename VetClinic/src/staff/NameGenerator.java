package staff;

import java.util.Random;

public class NameGenerator {

	
	// trocar esses nomes
	private String[] firstName = {"ken", "Tom", "Sally", "Pavel", "Priscilla", "Claudia"};
	
	// trocar esses sobrenomes
	private String[] surName = {"Murphy", "Silva", "Smith", "Jones", "Carvalho", "Ernst"};
	
	public NameGenerator() {
		// TODO Auto-generated constructor stub
	}
	
	public String getRandomName() {
		//return a random name
		
		Random r = new Random();
		
		//pick a firstname and surname based on length of array
		String fname = firstName[r.nextInt(firstName.length)];
		String sname = surName[r.nextInt(surName.length)];
		
		return ( fname + " " + sname);
		
	}

}
