package JavaQues;

public class RemoveAllAlpha {
	public static void main(String[] args) {
		String s = "vikas8920";
		String str = "";
		
		for(int i =0; i< s.length(); i++) {
			if(s.charAt(i)<'0' || s.charAt(i)<='9')
				str += s.charAt(i);
		}
		System.out.print(str);
	}
}
