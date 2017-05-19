
public class AssignmentOne {

	public static void main(String[] args) {
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
