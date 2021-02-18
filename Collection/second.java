
//Write a program to convert List to Array.  
package List;

import java.util.ArrayList;
import java.util.List;

public class second {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("priti");
		list.add("pari");
		list.add("priya");
		
		//using toArray
		String arr[] = list.toArray(new String[list.size()]);
		for (String string : arr) {
			System.out.println(string);
		}

		//OR
		System.out.println(" ");
		
		String arr2[] = new String[list.size()];
		list.toArray(arr2);
		for (String string : arr2) {
			System.out.println(string);
		}
		
		
		//using for loop
		String arr1[] = new String[list.size()];
		
		for(int i=0;i<list.size();i++)
		{
			arr1[i] = list.get(i);
		}
		
		System.out.println(" ");
		for (String string : arr1) {
			System.out.println(string);
		}
		
	}
}
