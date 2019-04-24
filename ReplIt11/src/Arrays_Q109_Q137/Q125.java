package Arrays_Q109_Q137;

import java.util.Scanner;

public class Q125 {
	public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
				int k = 0;
				double total = 0;
				double avgTemp = 0;
				double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
						scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };
		  
		    for(int i=0; i<temps.length; i++)
		         total += temps[i];
		      System.out.println(total/temps.length);
		    
		  }
}
