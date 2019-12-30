package deloitte;

public class Bus implements Vehicle{

	public static void main(String[] args) {
		Vehicle bus=new Bus();
		bus.Wheels();
		bus.Engines();
		
	}

	@Override
	public void Wheels() {
		System.out.println("no of wheels= 6");
		
	}

	@Override
	public void Engines() {
		System.out.println("no of engines= 2");
		
	}

}
