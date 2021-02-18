package List;
//adding element to list using index
//sorting ascending and descending
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Eighth_sortingList{

	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(8);
		list.add(56);
		list.add(1);
		list.add(90);
		list.add(43);
		list.add(5,15);
	System.out.println("given list is:"+list);
	Collections.reverse(list);
	System.out.println("given list in reverse order is:"+list);
	Collections.sort(list);
	
	System.out.println("list in ascending order:"+list);
	Collections.sort(list,Collections.reverseOrder());
	System.out.println("list in descending order:"+list);
	
	
	
	}

}
