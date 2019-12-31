package deloitte;

import java.util.HashSet;


public class HashSetExample {

	public static void main(String[] args) {
		HashSet items=new HashSet<>();
		items.add(" apple");
		items.add(" mango");
		items.add(" orange");
		items.add(123);
        items.add(null);
		items.add(" grapes");
		System.out.println(items);

	}

}
