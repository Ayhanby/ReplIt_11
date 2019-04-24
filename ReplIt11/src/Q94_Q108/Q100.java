package Q94_Q108;

import java.util.Scanner;

public class Q100 {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int prize = 0;
	    int a = scan.nextInt();
	    int b = scan.nextInt();
	    int c = scan.nextInt();
	    int d = scan.nextInt();
	    
	    if((a==b && a ==c) && (a==d))
	      prize += 30;
	   else if(((a == b && b==c) || (a==b && a==d)) )
	        prize +=20;
	    else if ((b==c && c==d) || (a==c && a==d))
	      prize += 20;
	    else if( (a == b || b==c) ||(c == d  || a == d) )
	      prize += 10;
	    
	    
	    System.out.println(prize);
	    
	  }

}
