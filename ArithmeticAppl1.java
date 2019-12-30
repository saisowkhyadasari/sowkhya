package deloitte;

public class ArithmeticAppl1 {

	public static void main(String[] args) {
		Arithmetic1 arithmetic=(x,y)->{
			System.out.println("add method");
			return x+y;
		};
		
		System.out.println(arithmetic.add(2,3));
		arithmetic.output();
	}

}
