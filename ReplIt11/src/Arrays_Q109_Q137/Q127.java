package Arrays_Q109_Q137;

import java.util.*;

public class Q127 {
	 public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String str1 = scan.nextLine();
		    
		    String[] str=str1.split(", ");
		    int z=str.length;
		    int[] nums=new int[z];
		    String result="";
		    for(int i=0; i<z; i++)
		        nums[i]=str[i].trim().length();
		        
		        Arrays.sort(nums);
		        
		        for(int i=0; i<z; i++)
		            if(str[i].length() == nums[0])
		                result +=str[i]+",";
		       
		       
		       String[] arr=result.split(",");
		       Arrays.sort(arr);
		       System.out.println(Arrays.toString(arr));
		        
		    
		    
		  }

}
