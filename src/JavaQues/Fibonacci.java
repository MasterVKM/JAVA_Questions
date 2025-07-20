package JavaQues;
public class Fibonacci {
	
	public static void main(String[] args) {
		int sum=0, a=0, b=1;
		for(int i=1; i<=10; i++) {
			System.out.print(a + " ");
			sum=a+b;
			a=b;
			b=sum;
		}
	}

}
