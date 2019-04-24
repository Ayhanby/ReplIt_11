package Arrays_Q109_Q137;

import java.util.Scanner;

public class Q111 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	   
	   int z=nums.length;
		  for(int j=0; j<z; j++) {
		    	int num=0;
				for(int i=0; i<nums.length; i++) {
					if(nums[i]==nums[j])
						num++;
				}
		    	if(num==1) {
		    		System.out.println(nums[j]);
		    		break;
		    	}
		    }  
	    
	    
	  }

}
