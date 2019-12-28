package deloitte;

public class Circle extends Shape{
	protected int radius;
	final double pi=3.14;
	public Circle(String radius) {
		super(radius);
		this.radius=Integer.parseInt(radius);
		
	}
	@Override
	void area() {
		
		System.out.println("Area of circle="+(pi*radius*radius));
	}
	public static void main(String args[]){
		Circle circle=new Circle(args[0]);
		circle.area();
	}
	}


