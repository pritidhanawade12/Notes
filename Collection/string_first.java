// finding character at string

public class first {

	public static void main(String[] args)
	{
		String name = "welcome";
		System.out.println(name.charAt(0));
		System.out.println(name.substring(0,2));
		System.out.println(name.substring(0,2) + name.substring(3));
		
		String newstring = "go";
		System.out.println(name.replace("come", "go"));
		
		StringBuffer b = new StringBuffer("welcome");
		System.out.println(b.reverse());
		
		
		char[] arr = name.toCharArray();
		char[] newarr = new char[arr.length];
		
		for(int i=0 ; i<arr.length;i++)
		{
			newarr[arr.length-1-i]=arr[i];
			
		}
		
		System.out.println("reverse array using for loop is::");
		System.out.println(newarr);
	
	
	}
}
