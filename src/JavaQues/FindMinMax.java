package JavaQues;

public class FindMinMax {
	public static void main(String[] args) {
		int[] arr = { 11,99,4,1,99,100,11};
		int max =arr[0], min = arr[0];
		for(int i=0; i<arr.length-1; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		for(int i=0; i<arr.length-1; i++) {
			if(min<arr[i]) {
				min = min;
			}else
				min = arr[i];
		}
		System.out.print("max : " + max + ": min : " + min);
	}
}
