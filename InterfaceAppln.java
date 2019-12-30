package deloitte;

public class InterfaceAppln implements One,Three{

	public static void main(String[] args) {
		One one =new InterfaceAppln();
		System.out.println(x);
		one.methodOne();
		one.methodTwo();
		
		}

	@Override
	public void methodOne() {
		System.out.println("method one");	
	}
	@Override
	public void methodTwo() {
		System.out.println("method Two");	
	}
	@Override
	public void methodThree() {
		System.out.println("method Three");	
	}
	

}
