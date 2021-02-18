//Write a program to traverse (or iterate) ArrayList?

package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class first {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("priti");
		list.add("pari");
		list.add("priya");
		
		//using iterator
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext())
		{
			
			String s = iterator.next();
			System.out.println(s);
			
		}
		
		//using for-loop
		
		System.out.println(" ");
		for(int i=0;i<list.size();i++)
		{
			
			System.out.println(list.get(i));
		}
		
		//using for-each
		System.out.println(" ");
		for (String string : list) {
			System.out.println(string);
		}
	}

}
