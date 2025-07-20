package JavaQues;

public class ReverseArray {
 public static void main(String[] args) {
	 int[] arr = {3,2,9,7,1};
	 int j=0;
	 int[] rev = new int[arr.length];
	 for(int i=arr.length-1; i>=0; i--) {
		 rev[j]= arr[i];
		 j++;
	 }
	 for(int i=0; i<rev.length; i++) {
	 System.out.print(rev[i]);
	 }
 }
}
