package JavaQues;

public class RemoveDuplicateString {
	public static void main(String[] args) {
		String s = "avaikasi";
		String str = "";
		for(int i=0; i<s.length(); i++) {
			boolean found = false;
			for(int j=i+1; j<s.length(); j++) {
				if(s.charAt(i) == s.charAt(j))
					found = true;
			}
			if(!found)
				str += s.charAt(i);
		}
		System.out.print(str);
	}
}
