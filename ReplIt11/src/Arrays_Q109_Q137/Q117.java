package Arrays_Q109_Q137;

import java.util.*;

public class Q117 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};	
	
	int z=nums.length;
    int[] nums2=new int[z];
    int y=0;
   for(int i=z-1; i >= 0; i--){
		          nums2[i]=nums[y];
		          y++;
		    }
      nums=nums2;
    //Do not change below statement:
    System.out.println(Arrays.toString(nums));
    
  }

}
