package task;

import staff.StaffInterface;

public class TaskInterface {
	
	// attributes
	protected StaffInterface staff;
	protected String task;
	
	// constructor
	public TaskInterface(StaffInterface staff, String task) {
		super();
		this.staff = staff;
		this.task = task;
	}

	// getters and setters
	public StaffInterface getStaff() {
		return staff;
	}

	public void setStaff(StaffInterface staff) {
		this.staff = staff;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}
	
	
	
}
