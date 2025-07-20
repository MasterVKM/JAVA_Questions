package JavaQues;
import java.util.Arrays;

public class StringRAnagram {
	public static void main(String[] args) {
		String s1 = "vkiaas";
		String s2 = "saaikv";
		boolean found = true;
		char[] ch1 = s1.toCharArray();
		Arrays.sort(ch1);
		char[] ch2 = s2.toCharArray();
		Arrays.sort(ch2);
		
		if(s1.length()!=s2.length())
			System.out.print("String not anagram");
		else {
			for(int i=0; i<s1.length(); i++) {
					if(ch1[i]!=ch2[i]) {
						found = false;
						break;
					}
			}
		}
		if(found)
			System.out.print("Strings are anagram");
		else
			System.out.print("Strings not anagram");
	}
}
