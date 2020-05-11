package staff;

public abstract class StaffInterface {

	//	create attributes
	protected NameGenerator name;
	protected static int staffNumber = 1;
	protected int salaryLevel;
	
	//	Constructor
	public StaffInterface(String name, int staffNumber, int salaryLevel) {
		super();
		this.name = new NameGenerator();
		this.staffNumber = getStaffNumber();
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
