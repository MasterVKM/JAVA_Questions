package JavaQues;

public class Merge2SortArray {
	public static void main(String[] args) {
		int[] n1 = {1,2,3,4,5,5};
		int[] n2 = {1,22,33,44,55,66};
		int n = n1.length;
		int m = n2.length;
		int[] merge = new int[n1.length + n2.length];
		
		int i=n-1, j=m-1, k= n+m-1;
		
		while(i>=0 && j>=0) {
			if(n1[i]>n2[j])
				merge[k--] = n1[i--];
			else
				merge[k--] = n2[j--];
		}
		
		while (i >= 0) {
	            merge[k--] = n1[i--];
	        }
		
		while(j>=0) {
			merge[k--] = n2[j--];
		}
		for(int x=0; x<merge.length;x++) {
			System.out.print(" " + merge[x]);
		}
	}
}
