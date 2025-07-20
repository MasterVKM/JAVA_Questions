package JavaQues;

public class methodOverloading {
	void sum(int a, long b) {
		System.out.print(a+b);	
	}
	void sum(long a, int b) {
		System.out.print(a+b);
	}
	
	public static void main(String[] args) {
		methodOverloading obj = new methodOverloading();
		obj.sum(200l, 20);
	}
}
