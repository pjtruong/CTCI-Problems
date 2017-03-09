import java.util.LinkedList;


public class Q2of5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		Node head1 = new Node(7);
		head1.insert(1);
		head1.insert(6);
		
		Node head2 = new Node(5);
		head2.insert(9);
		head2.insert(2);
		
		Node sum = new Node(1);
		int carry = 0;
		
		Node curr = head1;
		while (head1 != null){
			int value = (head1.data + head2.data) % 10 + carry;
			carry = (head1.data + head2.data) / 10;
			
			head1.data = value;
			
			head1 = head1.next;
			head2 = head2.next;
		
			
		}
		
		
		System.out.print(curr.data + " " + curr.next.data + " " + curr.next.next.data);
		
		

	}

}
