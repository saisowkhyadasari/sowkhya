package deloitte;

public class EmployeeNotFoundException extends Exception {
	public EmployeeNotFoundException(){
		super("employee not available");
	}

}
