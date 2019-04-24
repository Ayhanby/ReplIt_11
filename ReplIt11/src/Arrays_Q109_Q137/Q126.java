package Arrays_Q109_Q137;

import java.util.*;

public class Q126 {
	 public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String[] str = {scan.next(), scan.next(), scan.next(), 
		                    scan.next(), scan.next(), scan.next()};
		                    
		      int[] nums=new int[str.length];
		      for(int i=0; i<str.length; i++)
		          nums[i]=str[i].length();
		          
		          Arrays.sort(nums);
		          
		          for(int i=0; i<str.length; i++)
		            if(str[i].length() == nums[0])
		              System.out.println(str[i]);
		      
		      
		  }

}
