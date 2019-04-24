package Arrays_Q109_Q137;

import java.util.*;

public class Q123 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int[] inhabitants = new int[8];
	    for(int i=0; i<inhabitants.length; i++) {
	      inhabitants[i] = input.nextInt();
	    }
	    
	    //TODO. Write you code below this line. 
	    int[] newpopus = new int[inhabitants.length];
		    int days=0;
			System.out.println("Day "+days+" " + Arrays.toString(inhabitants));
				do {
					for (int i = 0; i < inhabitants.length; i++) 
						newpopus[i] = (inhabitants[i] /= 2);
					
					int EndIsNear = 0;
					for (int z : newpopus) 
						  EndIsNear += z;
					
					days++;
					System.out.println("Day " + days + " " + Arrays.toString(newpopus));
					if (EndIsNear == 0){
					  System.out.println("---- EXTINCT ----");
						break;
					}
				} while (true);
	    
	    
	  }

}
