package deloitte;

public class Aeroplane implements Vehicle{

	public static void main(String[] args) {
		Vehicle aeroplane=new Aeroplane();
		aeroplane.Wheels();
		aeroplane.Engines();
		
	}

	@Override
	public void Wheels() {
		System.out.println("no of wheels= 5");
		
	}

	@Override
	public void Engines() {
		System.out.println("no of engines= 2");
		
	}

}
