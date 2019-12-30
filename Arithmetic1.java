package deloitte;

public interface Arithmetic1 {
	int add(int x,int y);
	default void output(){
		System.out.println("ouput");
	}
}
