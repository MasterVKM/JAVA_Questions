package JavaQues;

public class OnlyNoString {
	public static void main(String[] args) {
		String s ="120345";
		boolean found = true;
		for(int i =0; i< s.length(); i++) {
			if(s.charAt(i)<'0' || s.charAt(i)>'9')
			found = false;	
		}
		if(found)
			System.out.print("String have only numbers");
		else
			System.out.print("String have a char");
	}
}
