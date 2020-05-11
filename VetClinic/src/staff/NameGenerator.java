package staff;

import java.util.Random;

public class NameGenerator {

	
	// Array for names
	private String[] firstName = {"Katerina", "Atticus", "Menachem", "Brooklyn", "Haaris", "Brittney",
			"Tiah", "Anya", "Melina", "Huzaifa", "Mehreen", "Paloma", "Carole", "Rabia", "Trevor", "Anisa",
			"Yvette", "Heather", "Jacqueline", "Amaya", "Zoey", "Benjamin", "Cara", "Yareli", "Wendy ", "Addison", "Kymani",
			"Kolton", "Bruno", "Belton"};
	
	// Array for surname
	private String[] surName = {"Arellano", "Brewer", "Wallis", "Benton", "Cottrell", "Castro", "Spears",
			"Wolfe", "Mac", "Cole", "Drake", "Leonard", "Roth", "Mill", "Corbett", "Rooney", "Marriott",
			"Driscoll", "Hobbs", "Millar", "Jefferson", "O'Quinn", "Kramer", "Terrell", "Zhang", "King", "Jorra", "Fitsburg", "McDonnald",
			"Dracker"};
	
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
