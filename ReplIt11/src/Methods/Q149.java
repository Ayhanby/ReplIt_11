package Methods;

import java.util.Scanner;

public class Q149 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    timeConversion(scan.nextLine());
	  }
	  
	  public static void timeConversion(String s) {
	    /*
			 * Write your code here.
			 */
			 String A = s.substring(s.length()-2);
			 if(A.equals("PM")){
			   
			  int i = new Integer(s.substring(0,2))+12;
			  if(i<24){
			   s= ""+i+s.substring(2, s.length()-2);
			  }
			 } else s=s.substring(0, s.length()-2);
			 System.out.println(s);
			 
	  }

}
