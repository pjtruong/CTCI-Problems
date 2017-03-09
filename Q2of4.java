
public class Q2of4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head = new Node(4);
		head.insert(3);
		head.insert(2);
		head.insert(1);
		
		Node test1 = head;
		while(test1 != null){
			
			System.out.print(test1.data + " ");
			test1 = test1.next;
		}
		System.out.println("");
		
		int x = 3;
		
		Node list1 = null;
		Node list2 = null;
		Node curr = head;
		

		
		while(curr != null){
			if(curr.data < x){
				if(list1 == null){
					list1 = new Node(curr.data);
					
				}
				else{
					list1.insert(curr.data);
					
				}
				
			}else if(curr.data > x){
				if(list2 == null){
					list2 = new Node(curr.data);
					
				}
				else{
					list2.insert(curr.data);
					
				}
			}
			
		
			curr = curr.next;
			
		}
		
		
		Node current = list1;
		while(current.next != null){
			
			current = current.next;
			
		}
		
		current.next = new Node(x);
		current.next.next = list2;
		
		Node test = list1;
		while(test != null){
			
			System.out.print(test.data + " ");
			test = test.next;
		}
		
	}

}
