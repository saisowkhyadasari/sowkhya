package deloitte;

public class Library extends Student{
	protected int libDue;
public Library(int regno, String stdname, String group,int libDue) {
		super(regno, stdname, group);
		this.libDue=libDue;
	}
 }


