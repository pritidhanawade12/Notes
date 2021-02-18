import java.util.LinkedList;

//creating linked list
public class Linked_list1 {
	Node head; 
	
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			this.data = d;
			this.next = null;
		}
	}
	
	public static void main(String[] args) {
		Linked_list1 list = new Linked_list1();
		list.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		list.head.next = second;
		second.next = third;
		
		list.printlist();
		list.printlist1();
		
	}

	private void printlist1() {
		Node n = head;
		Node lastnode = null;
		while(n!=null)
		{
		
			if(n.next ==null)
			{
				lastnode = n;
			}
			n=n.next;
		}
		System.out.println("lastnode is "+lastnode.data);
		
	}

	private void printlist() {
	Node n = head;
	while(n!=null)
	{
		System.out.println(n.data);
		n=n.next;
	}
		
	}
}
