package JavaQues;

public class ReverseString {
	public static void main(String[] args) {
		String s = "vikasMishra";
		String str = "";
		for(int i = s.length()-1; i>=0; i--) {
			str += s.charAt(i);
		}
		System.out.print(str);
	}
}
