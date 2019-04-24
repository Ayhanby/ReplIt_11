package Arrays_Q109_Q137;

import java.util.*;

public class Q124 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int[] inhabitants = new int[8];
	    for(int i=0; i<inhabitants.length; i++) {
	      inhabitants[i] = input.nextInt();
	    }
	    
	    //TODO. Write you code below this line. 
	    int cnt = 0;
		       System.out.println("Day " + cnt + " " + Arrays.toString(inhabitants));
		       while(true) {
		           for (int i = 0; i < inhabitants.length; i++) 
		               if (i < inhabitants.length - 1) {
		                   if (inhabitants[i] != 0 && inhabitants[i + 1] == 0) 
		                       inhabitants[i] /= 2;

		                   if (inhabitants[i] == 0 && inhabitants[i + 1] != 0) {
		                       inhabitants[i + 1] /= 2;
		                       i++;
		                   }
		               }
		           
		           int sum = 0;
		           for (int n=0; n<inhabitants.length; n++) 
		                 sum += inhabitants[n];
		           
		           cnt++;
		           System.out.println("Day " + cnt + " " + Arrays.toString(inhabitants));
		          if(sum==0) break;
		       } 

		       System.out.println("---- EXTINCT ----");
	    
	    
	  }

}
