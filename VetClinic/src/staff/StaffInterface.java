package staff;

import java.util.Random;

public abstract class StaffInterface {
	
	

	//	create attributes
	protected String name;
	protected static int staffNumber = 1;
	protected int salaryLevel;
	
protected String names() {
	// Array for names
	 String[] firstName = {"Katerina", "Atticus", "Menachem", "Brooklyn", "Haaris", "Brittney",
			"Tiah", "Anya", "Melina", "Huzaifa", "Mehreen", "Paloma", "Carole", "Rabia", "Trevor", "Anisa",
			"Yvette", "Heather", "Jacqueline", "Amaya", "Zoey", "Benjamin", "Cara", "Yareli", "Wendy ", "Addison", "Kymani",
			"Kolton", "Bruno", "Belton"};
	
	// Array for surname
	 String[] surName = {"Arellano", "Brewer", "Wallis", "Benton", "Cottrell", "Castro", "Spears",
			"Wolfe", "Mac", "Cole", "Drake", "Leonard", "Roth", "Mill", "Corbett", "Rooney", "Marriott",
			"Driscoll", "Hobbs", "Millar", "Jefferson", "O'Quinn", "Kramer", "Terrell", "Zhang", "King", "Jorra", "Fitsburg", "McDonnald",
			"Dracker"};
	
	Random r = new Random();
	
	String fname = firstName[r.nextInt(firstName.length)];
	String sname = surName[r.nextInt(surName.length)];
	
	return ( fname + " " + sname);
}
		
	
	//	Constructor
	public StaffInterface(String name, int staffNumber, int salaryLevel) {
		super();
		this.name = names();
		this.staffNumber = getStaffNumber();
		this.salaryLevel = salaryLevel;
		staffNumber ++;
	}
	
	
	// Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStaffNumber() {
		return staffNumber ++;
	}
	
	public int getSalaryLevel() {
		return salaryLevel;
	}
	public void setSalaryLevel(int salaryLevel) {
		this.salaryLevel = salaryLevel;
	}
	
	@Override
	public String toString() {
		System.out.println(this.name);
		return super.toString();
	}
}
