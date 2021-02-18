//Write a program to initialize a HashMap in java and sorting ?]
package List;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class sixth {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(3,"Priti");
		map.put(4,"Anjali");
		map.put(1,"Komal");
		map.put(2,"Shamal");
		map.put(67,"Priti");
		map.put(90,"Anjali");
		map.put(11,"Komal");
		map.put(22,"Shamal");
		
	Set<Entry<Integer, String>> iterator = map.entrySet();
	Iterator it = 	iterator.iterator();
	System.out.println("before sorting: ");
	while(it.hasNext())
	{
	
		Map.Entry<Integer,String> pair= (Entry<Integer, String>) it.next();
		System.out.println(pair.getKey() + " : " + pair.getValue());
	}
	System.out.println(" ");
	System.out.println("after sorting: ");
	
	
	Map<Integer, String> map1 = new TreeMap<Integer, String>(map);    
	Set<Entry<Integer, String>> iterator1 = map1.entrySet();
	Iterator it1 = 	iterator1.iterator();
	while(it1.hasNext())
	{
		Map.Entry<Integer,String> pair= (Entry<Integer, String>) it1.next();
		System.out.println(pair.getKey() + " : " + pair.getValue());
	}
	
	}
	
	
	
}
