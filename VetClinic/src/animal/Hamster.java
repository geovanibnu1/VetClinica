package animal;

public class Hamster extends AnimalInterface{

	public Hamster(String string, int age, String medicalCondition) {
		super(string, age, medicalCondition);
		// TODO Auto-generated constructor stub
	}
	
	protected final String animalKind = "Hamster";
	
	public String getAnimalKind() {
		return animalKind;
	}

}
