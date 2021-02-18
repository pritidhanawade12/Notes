//write program to remove null from list.

package List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

	public class third{

		
		public static void main(String[] args) {
			
			List<String> list = new ArrayList<>();
			list.add("priti");
			list.add("pari");
			list.add("priya");
			list.add(null);
			list.add(null);
			list.add(null);
			
			
			System.out.println(list);
			System.out.println(list.size());
			
			
//			Iterator<String> iterator = list.iterator();
//			while(iterator.hasNext())
//			{
//				
//				String s = iterator.next();
//				if(s == null)
//					iterator.remove();
//				else
//					System.out.println("hello");
//				
//			}
//	
			
			
			for(int i=list.size()-1;i>=0;i--)
			{
				if(list.get(i) == null)
				{
					System.out.println(list.get(i));
					list.remove(i);
					
				}
			}
			
			
		
			System.out.println(list);
			System.out.println(list.size());


		
		}

	}

	
	
