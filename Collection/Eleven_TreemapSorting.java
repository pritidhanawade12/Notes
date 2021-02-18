package List;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Eleven_TreemapSorting {

	private int empId;
	private String empName;
	private String address;
	
	
	public Eleven_TreemapSorting(int empId, String empName, String address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "Eleven_TreemapSorting [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}


	public static void main(String[] args) {
		Map<Integer,Eleven_TreemapSorting> map = new TreeMap<>();
		map.put(1,new Eleven_TreemapSorting(1,"priti","Satara"));
		map.put(99,new Eleven_TreemapSorting(2,"sanjana","nagpur"));
		map.put(17,new Eleven_TreemapSorting(3,"amer","nanded"));
		map.put(22,new Eleven_TreemapSorting(4,"mukesh","pune"));
		map.put(5,new Eleven_TreemapSorting(5,"priya","Satara"));
		
		System.out.println("sorting based on keys: \n");
		Set<Entry<Integer, Eleven_TreemapSorting>> set = map.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext())
		{
		
			Map.Entry<Integer,Eleven_TreemapSorting> pair= (Entry<Integer, Eleven_TreemapSorting>) it.next();
			System.out.println(pair.getKey() + " : " + pair.getValue().toString());
		}
		
	}
	
	
	
	
}
