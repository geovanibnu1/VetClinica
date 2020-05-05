package animal;

import java.util.Random;

public class NameGenerator {

	
	// Array for names
	private String[] petName = {"Flow", "Geppetto", "Cliff", "Bulbasaur", "Mimi", "Brittney"};
	
	public NameGenerator() {
		// TODO Auto-generated constructor stub
	}
	
	public String getRandomName() {
		//return a random name
		
		Random r = new Random();
		
		//pick a petname and surname based on length of array
		String name = petName[r.nextInt(petName.length)];
		
		return ( name );
		
	}

}
