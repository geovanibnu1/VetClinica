package animal;

public class Chinchilla extends AnimalInterface{
	
	public Chinchilla(String string, int age, String medicalCondition) {
		super(string, age, medicalCondition);
		// TODO Auto-generated constructor stub
	}

	protected final String animalKind = "Chinchilla";

	public String getAnimalKind() {
		return animalKind;
	}

}
