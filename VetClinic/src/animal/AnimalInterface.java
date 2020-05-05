package animal;

public abstract class AnimalInterface {
	
	protected NameGenerator name;
	protected int age;
	protected MedicalConditionGenerator medicalCondition;
	
	
	public AnimalInterface(String string, int age, String medicalCondition) {
		super();
		this.name = new NameGenerator();
		this.age = age;
		this.medicalCondition = new MedicalConditionGenerator();
	}
	
	public NameGenerator getName() {
		return name;
	}
	public void setName(NameGenerator name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public MedicalConditionGenerator getMedicalCondition() {
		return medicalCondition;
	}
	public void setMedicalCondition(MedicalConditionGenerator medicalCondition) {
		this.medicalCondition = medicalCondition;
	}
	
	

}