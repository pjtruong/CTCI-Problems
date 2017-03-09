
public class Q2of2 {
	
	public static void main (String[] args){
		
		Node head = new Node(3);
		head.next = new Node(1);
		head.next.next = new Node(3);
		head.next.next.next = new Node(2);
		head.next.next.next.next = new Node(6);
		
		int n = 2;
		int size = 0;
		
		Node current = head;
		
		while(current != null){
			size++;
			current = current.next;
		}
		
		
		current = head;
		for(int i=0; i<size-n; i++)
		{
			current = current.next;
		}
		
		System.out.print(current.data);
		
		
	}

}
