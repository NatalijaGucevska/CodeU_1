import java.util.HashMap;

public class Q1 {
	
	/**
	 * Given two strings isPermutation decides if one
	 * is a permutation of the other
	 */
	public boolean isPermutation(String first, String second) {
		if(first == null || second == null || first.length() != second.length()) {
			return false; 
		}
		
		HashMap<Character, Integer> occurrences = new HashMap<>();
		String lowerFirst = first.toLowerCase(); 
		String lowerSecond = second.toLowerCase(); 
		
		//Fill in the occurrence matrix
		for(int i=0; i < lowerFirst.length(); i++) {
			char c = lowerFirst.charAt(i);
			int val = occurrences.getOrDefault(c, 0);
			occurrences.put(c, val + 1);	
		}
		
		//Test if it is palindrome
		for(int i=0; i < lowerSecond.length(); i++) {
			char c = lowerSecond.charAt(i);
			int val = occurrences.getOrDefault(c, 0);
			if(val <= 0) {
				return false;
			} else {
				occurrences.put(c, val - 1);	
			}
		}
		
		return true;
	}
}
