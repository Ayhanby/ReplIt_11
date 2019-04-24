package Arrays_Q109_Q137;

import java.util.Scanner;

public class Q112 {
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	   

	    
	    for(int i=0; i<words.length; i++){
			      String AA=""+words[i].charAt(0)+words[i].charAt(words[i].length()-1);
			      System.out.println(AA);
			    }
	    
	    
	  }

}
