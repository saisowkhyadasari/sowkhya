package deloitte;

public class Rectangle extends Shape {
	protected int length;
	protected int breadth;
	public Rectangle(String length, String breadth) {
		super(length, breadth);
		this.length=Integer.parseInt(length);
		this.breadth=Integer.parseInt(breadth);
		
	}

	@Override
	void area() {
		
		System.out.println("Area of Rectangle is "+(length*breadth));
	}

	public static void main(String args[]){
		Rectangle rectangle=new Rectangle(args[0],args[1]);
		rectangle.area();
	}
}
