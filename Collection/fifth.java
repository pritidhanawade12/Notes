//Given an element write a program to check if element(value) exists in ArrayList?
package List;

import java.util.ArrayList;
import java.util.List;

public class fifth {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		if(list.contains(2))
			System.out.println("element found in the list");
		else
			System.out.println("element not found in the list");
			
		
	}
}
