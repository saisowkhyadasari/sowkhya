package deloitte;

public class ClassOneApplication extends ClassOne {
	public ClassOneApplication(int x, int y) {
		super(x, y);
		
	}

	public static void main(String[] args) {
		ClassOne one=new ClassOneApplication(5,6);
		one.output();

	}

	@Override
	void output() {
		System.out.println(+x);
		
	}

}
