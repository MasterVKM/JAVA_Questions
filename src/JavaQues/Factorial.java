package JavaQues;

public class Factorial {
	public static void main(String[] args) { 
		int n=5;
		int fact =1;
		for(int i=1; i<=n; i++) {
			fact *= i;
		}
		System.out.print(fact);
	}
}


// find 3 max numbers in an array and print their sum
//	
//	public static void main(String[] args) {
//		int k=0;
//		int[] arr= {1,8,3,4,19,0,9};
//		int max1 =arr[0];
//		int max2 = arr[0], max3 = arr[0];
//		
//		for(int i=0; i<arr.length; i++) {
//			if(max1<arr[i]) {
//				max3= max2;
//				max2= max1;
//				max1=arr[i];
//			}
//			else if(max2<arr[i]) {
//				max3=max2;
//				max2 = arr[i];
//			}
//			else if(max3<arr[i])
//				max3 = arr[i];
//		}
//		k= max1+max3+max2;
//		System.out.print(k);
//	}
//}