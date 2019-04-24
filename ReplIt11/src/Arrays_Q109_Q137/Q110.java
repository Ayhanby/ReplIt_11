package Arrays_Q109_Q137;

import java.util.Scanner;

public class Q110 {
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	    //TODO: Write your code below
	    int EvenNums=0;
	    for(int i=0; i<nums.length; i++)
	      if(nums[i] %2==0)
	      EvenNums++;
	      
	      System.out.println(EvenNums);
	    
	  }
}
