//Write a program to sort ArrayList using Comparable and Comparator?
package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class seventh implements Comparable<seventh>{

	
	private int id;
	private String name;
	private String address;
	
	
	public seventh(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	
	@Override
	public int compareTo(seventh obj) {

		if(this.id > obj.id)
			return 1;
		else if(this.id == obj.id)
			return 0;
		else 
			return -1;
		
	}

	public static void main(String[] args) {
		
		List<seventh> list = new ArrayList<>();
		list.add(new seventh(1,"priti","satara"));
		list.add(new seventh(5,"sanjana","nagpur"));
		list.add(new seventh(2,"amer","nanded"));
		list.add(new seventh(8,"mukesh","pune"));

		Collections.sort(list);
		
//		for (second second : list) {
//			System.out.println(second.id + " " + second.name + " " + second.address);
//		}
//		
		
		Iterator<seventh> iterator = list.iterator();
		while(iterator.hasNext())
		{
			seventh s =  iterator.next();
			System.out.println(s.id + " " + s.name + " " + s.address);
			 
		}
		

	}
	
	
}
