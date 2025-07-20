// strings examples
package JavaQues;

import java.util.Arrays;

public class Strings {
	public static void main(String[] args) {
//	StringBuilder sb = new StringBuilder("Tony");
	
//	sb.insert(2,'m');						//insert shifts the character and make space for new one
//	System.out.println(sb);
	
//	sb.delete(3,4);
//	System.out.print(sb);
	
//	sb.deleteCharAt(2);
//	System.out.print(sb +"\n"+ sb.append("Stark"));
	
//					
		
			//reverse String 
		
		
//		        String str = "aaplaakkkiiv";
//		        int n = str.length();
//		        char[] ch = new char[n];
//
//		        for (int i = 0; i < n; i++) {
//		            ch[i] = str.charAt(n - 1 - i);   
//		        }
//
//		        for (int i = 0; i < ch.length; i++) {
//		            System.out.print(ch[i]);
//		    }
		
		
		
		
		//reverse String in StringBuilder
		
//		
//			StringBuilder sb = new StringBuilder("sakiv");
//			int n = sb.length();
//			for(int i =0; i<n/2; i++) {
//				
//				int front =i, end = n-1-i;
//				
//				char frontChar = sb.charAt(front);
//				char backChar = sb.charAt(end);
//				
//				sb.setCharAt(front, backChar);
//				sb.setCharAt(end, frontChar);
//
//				
//			}
//			
//		    System.out.print(sb);    



			int[] nums = {1,3,1,2,3,2,2};
			Arrays.sort(nums);
			
			int count =0;
			int i=0;
			while(i<nums.length) {
				if(nums[i]==nums[i+1]) {
					count++;
					i+=2;
				}else
					i++;	
			}
		
		int totalElements = count*2;
		int left = nums.length-totalElements;
		int[] arr = new int[2];
		arr[0]= count;
		arr[1] = left;
		
		
		System.out.print("array : " + Arrays.toString(arr));
		
		
		
    }
		

}













