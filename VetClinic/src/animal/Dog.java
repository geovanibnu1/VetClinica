package animal;

public class Dog extends AnimalInterface{
	
	public Dog(String string, int age, String medicalCondition) {
		super(string, age, medicalCondition);
		// TODO Auto-generated constructor stub
	}

	protected final String animalKind = "Dog";

	public String getAnimalKind() {
		return animalKind;
	}
	
	
}
