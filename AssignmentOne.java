public class AssignmentOne {

	public static void main(String[] args) {
				
		SingleLinkedList<Integer> list = new SingleLinkedList<>(); 
		
		//The linked list is empty
		try {
			list.kToLast(2);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
	    // The final linked list is 1->2->3->4->5
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println("Expected 4, returned " + list.kToLast(1));
        // k > size of the list, the value of the head should be printed		
		System.out.println("Expected 1, returned " + list.kToLast(6));
	
		Q1 q1 = new Q1();
		
		System.out.println("Expected false, returned " + q1.isPermutation(null, null));
		System.out.println("Expected false, returned " + q1.isPermutation("", null));
		System.out.println("Expected false, returned " + q1.isPermutation(null, "HelLo"));
		System.out.println("Expected false, returned " + q1.isPermutation("Hello", "Helo"));
		System.out.println("Expected true, returned " + q1.isPermutation("Hello", "HelLo"));
    System.out.println("Expected false, returned " + q1.isPermutation("Hi", "hellorr"));
    System.out.println("Expected true, returned " + q1.isPermutation("", ""));
    System.out.println("Expected true, returned " + q1.isPermutation("Hello", "elloh"));

	}

}
