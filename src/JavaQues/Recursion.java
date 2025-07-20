package JavaQues;

public class Recursion {
	
//	public static void num(int i) {
//		if(i==0)
//			return;
//		System.out.print(i);
//		num(i-1);
//		
//	}
//public static void main(String[] args) {
//		int i = 5;
//		num(i);
//	}
	
		//print sum on n numbers using recursion
	
//	public static void total(int i,int n, int sum) {
//		if(i==n) {
//			sum+=i;
//			System.out.print(sum);
//			return;	
//		}
//		sum+=i;
//		total(i+1,n, sum);
//	}
//	
//	public static void main(String[] args) {
//		total(1,10,0);
//		
//	}
	
	
		//print factorial of n numbers using recursion
	
	
//	
//	public static int calFact(int n) {
//		if(n==1 || n==0)
//			return 1;
//		int fac_n1 = calFact(n-1);
//		int fac = n*fac_n1;
//		return fac ;
//		
//		
//	}
//	public static void main(String[] args) {
//		
//		System.out.println(calFact(8));
//	}
	
	
	
	
	//fibonacci series with itration 
	
	
	
//	public static void main(String[] args) {
//		int n = 5;
//		int a=0, b=1;
//		int fib =0;
//		for(int i = 0; i<=n; i++) {
//			System.out.print(a + " " );
//			fib= a+b;
//			a=b;
//			b=fib;
//		}
//		System.out.print(fib);
//	}
//	
	
	
	
	//fibonacci series using recursion
	
	
	
//	public static void fibS(int a, int b, int n) {
//		if(n==0)
//			return ;
//		
//		int c = a+b;
//		System.out.print("\t" + c);
//		fibS(b,c,n-1);
//		
//	}
//	
//	public static void main(String[] args) {
//		int a=0,b=1;
//		int n=9;
//		System.out.print(a);
//		System.out.print("\t" + b);
//		fibS(a,b,n-2);
//		
//	}
	
	
	
	
	
	//print X^n using recursion
	
	
	
	
	public static int calcPwr(int x, int n) {
		if(n==0)
			return 1;
		if(x==0)
			return 0;
		
		int xpwr1 = calcPwr(x, n-1);
		int xpwr = x* xpwr1;
		return xpwr;
		
	}
	
public static void main(String[] args) {
	int x =2, n=5;
	System.out.print(calcPwr(x,n));
}
}
