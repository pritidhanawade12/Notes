package List;

import java.util.Iterator;
import java.util.Map;
//sorting treeset using comparable

import java.util.Set;
import java.util.TreeMap;

import java.util.TreeSet;
import java.util.Map.Entry;

public class Twelve_TreesetComparator implements Comparable<Twelve_TreesetComparator>{
	private int empId;
	private String empName;
	private String address;
	public Twelve_TreesetComparator(int empId, String empName, String address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Twelve [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}
	

	public static void main(String[] args) {
		
		Set<Twelve_TreesetComparator> set = new TreeSet<>();
		set.add(new Twelve_TreesetComparator(99,"priti","Satara"));
		set.add(new Twelve_TreesetComparator(5,"sanjana","nagpur"));
		set.add(new Twelve_TreesetComparator(45,"amer","nanded"));
		set.add(new Twelve_TreesetComparator(13,"mukesh","pune"));
		set.add(new Twelve_TreesetComparator(56,"priya","Satara"));
		
		Iterator<Twelve_TreesetComparator> iterator = set.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
	@Override
	public int compareTo(Twelve_TreesetComparator obj) {
		if(this.empId > obj.empId)
			return 1;
		else if(this.empId == obj.empId)
			return 0;
		else 
			return -1;
	}
	

}
