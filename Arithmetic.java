package deloitte;

public interface Arithmetic {
void add();
default void output(){
	System.out.println("ouput");
}
}
