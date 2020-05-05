package staff;

public abstract class StaffInterface {

	//	Attributes
	protected NameGenerator name;
	protected int staffNumber;
	protected int salaryLevel;
	
	//	Constructor
	public StaffInterface(String name, int staffNumber, int salaryLevel) {
		super();
		this.name = new NameGenerator();
		this.staffNumber = staffNumber;
		this.salaryLevel = salaryLevel;
	}
	
	
	// Getters and Setters
	public NameGenerator getName() {
		return name;
	}
	public void setName(NameGenerator name) {
		this.name = name;
	}
	public int getStaffNumber() {
		return staffNumber;
	}
	public void setStaffNumber(int staffNumber) {
		this.staffNumber = staffNumber;
	}
	public int getSalaryLevel() {
		return salaryLevel;
	}
	public void setSalaryLevel(int salaryLevel) {
		this.salaryLevel = salaryLevel;
	}
	
	
}
