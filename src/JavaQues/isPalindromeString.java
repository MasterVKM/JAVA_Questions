package JavaQues;

public class isPalindromeString {
	public static void main(String[] args) {
		String s = "racecar";
		boolean found = true;
		int i=0, j= s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				found = false;
				break;
			}
			i++; j--;
		}
		if(found) 
			System.out.print("palindrome");
		else
			System.out.print("not palindrome");
	}
}
