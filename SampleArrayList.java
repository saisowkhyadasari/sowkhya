package deloitte;

import java.util.ArrayList;
import java.util.Iterator;

public class SampleArrayList {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(567);
		list.add(55.55);
		list.add("deloitte");
		list.add(567);
		list.add(null);
		System.out.println(list);
		//System.out.println(list+" "+list.size());
		//list.add("hyd");
		//list.add(2,"java");
		//System.out.println(list+" "+list.size());
		//list.remove(2);
		//list.remove(new Integer(567));
		//System.out.println(list+" "+list.size());
		Iterator itr=list.listIterator();
		//while(itr.hasNext())
		//System.out.println(itr.next());
		while(itr.hasNext())
		{
			Object obj = itr.next();
		if(obj instanceof Integer)
			System.out.println(obj);	
		}
			
		
	}

	
	}
	
