package animal;

public class Cat extends AnimalInterface{

	public Cat(String string, int age, String medicalCondition) {
		super(string, age, medicalCondition);
		// TODO Auto-generated constructor stub
	}
	
	protected final String animalKind = "Cat";

	public String getAnimalKind() {
		return animalKind;
	}
}
