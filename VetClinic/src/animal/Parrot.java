package animal;

public class Parrot extends AnimalInterface{

	public Parrot(String string, int age, String medicalCondition) {
		super(string, age, medicalCondition);
		// TODO Auto-generated constructor stub
	}
	
	protected final String animalKind = "Parrot";

	public String getAnimalKind() {
		return animalKind;
	}

}
