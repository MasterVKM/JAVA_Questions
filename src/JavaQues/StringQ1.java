package JavaQues;

public class StringQ1{
	public static void main(String[] args) {
		String a = "im preparing for java";
		a = a.replaceAll(" ", "x");
		int count = 0;
		
		for (int i = 0; i < a.length(); i++) {
		    char ch = a.charAt(i);
		    System.out.print(ch);
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0; i< a.length(); i++) {
			if(a.charAt(i)!='x')
			 sb.append(a.charAt(i));
			else
				count++;
		}
		for(int i =0; i<=count; i++) {
		sb.append('x');
		}
	
		
		System.out.println();
		
		 System.out.println("x move : " + sb.toString());
	}
}


