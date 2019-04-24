package Arrays_Q109_Q137;

import java.util.Scanner;

public class Q116 {
	 public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    String sentence = input.nextLine();
		    
		    //type your code below
		    String[] arr=sentence.split(" ");
		    for(String each: arr){
		      System.out.println(each);
		    }
		  }

}
