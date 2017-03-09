import java.util.HashSet;
import java.util.LinkedList;


public class Q2of1 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(3);
		head.next = new Node(1);
		head.next.next = new Node(3);
		head.next.next.next = new Node(2);
		
		Node current = head;
		Node previous = null;
		HashSet<Integer> m = new HashSet<Integer>();
		while(current != null){
			if(m.contains(current.data)){
				previous.next = current.next;
			}
			else{
				m.add(current.data);
				previous = current;
			}
			
			current = current.next;
			
		}
		
		current = head;
		while(current != null)
		{
			System.out.print(current.data+" ");
			current = current.next;
		}
	}

}
