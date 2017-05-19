import java.util.HashMap;
import java.util.LinkedList;

public class AssignmentOne {

	public static void main(String[] args) {
				
		SingleLinkedList<Integer> list = new SingleLinkedList<>(); 
		
		//The linked list is empty
		try {
			list.kToLast(2);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
	    // The final linked list is 5->4->3->2->1
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println("Expected 2, returned " + list.kToLast(1));
        // k > size of the list, the value of the head should be printed		
		System.out.println("Expected 5, returned " + list.kToLast(6));
	}
	
}
