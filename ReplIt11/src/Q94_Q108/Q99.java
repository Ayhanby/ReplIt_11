package Q94_Q108;

import java.util.Scanner;

public class Q99 {
	
	 public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String str = scan.next();
		    int count = 0 ;
		    //WRITE YOUR CODE HERE
		    for(int i=0; i<str.length()-2; i++){
		      String AA=str.substring(i,i+3);
		      if(AA.charAt(0) == AA.charAt(1) && AA.charAt(1)==AA.charAt(2))
		           count++;
		    }
		    System.out.println(count);
		    
		  }
}
