package deloitte;

public class StudentExam extends Library {
	private int sub1;
	private int sub2;
	
	public StudentExam(int regno, String stdname, String group, int libDue,int sub1,int sub2) {
		super(regno, stdname, group,libDue);
		this.sub1=sub1;
		this.sub2=sub2;
		
	}
public void display()
	{
		System.out.println("from sub class");
	}
	public void output(){
		int total=sub1+sub2;
		System.out.println(regno+" "+stdname+" "+group+" "+total+" "+libDue);
	}

	public static void main(String[] args) {
		StudentExam exam=new StudentExam(123,"abcdef","ECE",5,50,90);
		Student student=new Student(13,"fg","ij");
	/*	exam.display();
		exam.output();*/
		student.display();
		student=exam;
		student.display();
		//exam.display();
		
	}

}
