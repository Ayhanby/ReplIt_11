package Q94_Q108;

import java.util.Scanner;

public class Q102 {

	 public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String str = scan.next();
		    int sum  = 0;
		   
		   str=str.replaceAll("[a-z,A-Z]","");
		   
		   for(int i=0; i< str.length(); i++)
		      sum += new Integer(""+str.charAt(i));
		   
		  System.out.println(sum);
		  
		  }
}
