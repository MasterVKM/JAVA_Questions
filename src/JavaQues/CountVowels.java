package JavaQues;

public class CountVowels {
	public static void main(String[] args) {
		String s = "Count VowelS and constant";
		s.toLowerCase();
		int vowels =0, constant = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
				vowels++;
			else
				constant++;
		}
		System.out.print("vowels : " + vowels + "  " + "Constant are : " + constant);
	}
}
