//How To Synchronize ArrayList In Java
package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Nine {

	public static void main(String[] args) {
		
		//using Collections.synchronizedList()
		List<String> list = new ArrayList<>();
		Collections.synchronizedList(list);
		list.add("priti");
		list.add("pari");
		list.add("priya");
		
		synchronized (list) {
			Iterator<String> it = 	list.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
				
			}
		}
	
		
		// Creating Synchronized ArrayList Object    
	    CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList<String>();
	    System.out.println(" ");
	    //Adding elements to synchronized ArrayList
	    al.add("Basketball");
	    al.add("Baseball");
	    al.add("Football");

	    System.out.println("Showing synchronized ArrayList Elements:");
	    //Synchronized block is not required in this method
	    Iterator<String> iterator = al.iterator(); 
	    while (iterator.hasNext())
	       System.out.println(iterator.next());
		
		
	}
}
