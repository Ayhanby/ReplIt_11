package Arrays_Q109_Q137;

import java.util.Scanner;

public class Q120 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    
	    //TODO: Type your code below
	    String[] str=sentence.split(" ");
			  
			    for(int i=str.length-1;i>=0;i--)
			      System.out.println(str[i]);
			    
	  }

}
