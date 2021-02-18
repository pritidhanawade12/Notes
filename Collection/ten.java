//Hashmap sorting based on key and value
package List;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class ten {
public static void main(String[] args) {
	Map<Integer,String> map = new HashMap<>();
	map.put(3,"Priti");
	map.put(4,"Anjali");
	map.put(67,"Varsha");
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
	System.out.println("after sorting based on keys: ");
	
	
	Map<Integer, String> map1 = new TreeMap<Integer, String>(map);    
	Set<Entry<Integer, String>> iterator1 = map1.entrySet();
	Iterator it1 = 	iterator1.iterator();
	while(it1.hasNext())
	{
		Map.Entry<Integer,String> pair= (Entry<Integer, String>) it1.next();
		System.out.println(pair.getKey() + " : " + pair.getValue());
	}
	
	System.out.println(" ");
	System.out.println("after sorting based on values: ");
	
	List list = new LinkedList<>(map.entrySet());
	Collections.sort(list, new Comparator() {
		public int compare(Object o1,Object o2)
		{
			return ((Comparable) ((Map.Entry) (o1)).getValue())
	        .compareTo(((Map.Entry) (o2)).getValue());
		}
        
	});
	
	  HashMap sortedHashMap = new LinkedHashMap();
      for (Iterator it3 = list.iterator(); it3.hasNext();) {
             Map.Entry entry = (Map.Entry) it3.next();
             sortedHashMap.put(entry.getKey(), entry.getValue());
      } 
	
      
      Set<Entry<Integer, String>> iterator2 =   sortedHashMap.entrySet();
      Iterator it2 = 	iterator2.iterator();
  	while(it2.hasNext())
  	{
  		Map.Entry<Integer,String> pair= (Entry<Integer, String>) it2.next();
  		System.out.println(pair.getKey() + " : " + pair.getValue());
  	}
  	
	}
	
}

