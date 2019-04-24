package Methods;

import java.util.Scanner;

public class Q143 {
	 
	  public static void sign(int n)
	  {
	    //your code here
	    int a=0;
	    if(n>0) a=1;
	    else if(n<0) a=-1;
	    System.out.println(a);
	  }//end sign
	  
	  public static void main(String[] args) {
	     Scanner inp = new Scanner(System.in);
	     int n = inp.nextInt();
	    
	    sign(n);
	  }

}
