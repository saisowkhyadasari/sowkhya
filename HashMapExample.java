package deloittecore1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String , Integer> phonebook=new HashMap<>();
		phonebook.put("nexwave",12345);
		phonebook.put("deloitte",12345);
		phonebook.put("abcdef",12345);
		System.out.println(phonebook);
		System.out.println(phonebook.get("nexwave"));
		Set set=phonebook.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());	
		
		
		
	}

}
