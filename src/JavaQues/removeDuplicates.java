package JavaQues;

import java.util.*;

class removeDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,4,0,4,1,2,3,6,3,4};
        Arrays.sort(nums);
          int k=1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]!=nums[k-1]){
            nums[k]=nums[i];
            k++;
            }
        }
        for (int i = 0; i < k; i++) {
    System.out.print(nums[i] + " ");
}

        
    }
}
