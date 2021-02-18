//Treemap
package List;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Eleven_Treemap {

	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<>();
		map.put(3,"Priti");
		map.put(4,"Anjali");
		map.put(67,"Varsha");
		map.put(11,"Komal");
		map.put(22,"Shamal");
		
		Set<Entry<Integer, String>> set = map.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext())
		{
		
			Map.Entry<Integer,String> pair= (Entry<Integer, String>) it.next();
			System.out.println(pair.getKey() + " : " + pair.getValue());
		}
		
	}
}
