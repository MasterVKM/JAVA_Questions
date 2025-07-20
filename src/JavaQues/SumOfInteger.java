package JavaQues;

public class SumOfInteger {
	public static void main(String[] args) {
		int a = 999;
		int sum =0;
		while(a>0) {
			sum += a%10;
			a = a/10;
		}
		System.out.print(sum);	}
}
