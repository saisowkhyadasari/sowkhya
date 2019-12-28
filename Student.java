package deloitte;

public class Student {
	protected int regno;
	protected String stdname;
	protected String group;
	public Student(int regno, String stdname, String group) {
		
		this.regno = regno;
		this.stdname = stdname;
		this.group = group;
	}
	
public Student() {
	
	}

public void display(){
	System.out.println(regno+" "+stdname+" "+group);
	System.out.println("this is from super class");
}
}
