package Arrays_Q109_Q137;

import java.util.*;

public class Q119 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    int decimal = input.nextInt();
	    int[] binary = new int[8];
	    
	    //TODO: Write your code below.
	    for(int j = binary.length - 1; j >= 0; j--) {
					binary[j] =  decimal % 2;
					decimal/=2;
					
				}
				System.out.print(Arrays.toString(binary));
	    
	    
	  }

}
