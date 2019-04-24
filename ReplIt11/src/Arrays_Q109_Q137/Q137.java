package Arrays_Q109_Q137;

import java.util.Scanner;

public class Q137 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},
	                              {scan.nextInt(), scan.nextInt(), scan.nextInt()},
	                              {scan.nextInt(), scan.nextInt(), scan.nextInt()}
	                            };
	    int result = 0;
	    int a=matrix[0][0]+matrix[1][1]+matrix[2][2];
	    int b=matrix[0][2]+matrix[1][1]+matrix[2][0];
	    result=a-b;
	    
	    // FINAL PRINT
	    System.out.println(Math.abs(result));
	    
	  }

}
