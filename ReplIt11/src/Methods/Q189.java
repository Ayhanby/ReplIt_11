package Methods;

import java.util.ArrayList;

public class Q189 {
	
	static void timesTwo(ArrayList<Integer> nums){
		  for(int i=0; i< nums.size(); i++)
		    nums.set(i, nums.get(i)*2);
		  
		  System.out.println(nums);
		}

}
