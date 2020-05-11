package animal;


public abstract class AnimalInterface {
	
	protected NameGenerator name;
	protected int age;
	protected MedicalConditionGenerator medicalCondition;
	
	
	public AnimalInterface(String name, int age, String medicalCondition) {
		super();
		this.age = age = (int) (Math.random() * Math.pow(20, 1));
		this.medicalCondition = new MedicalConditionGenerator();
	}
	
	public NameGenerator getName() {
		return new NameGenerator();
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
