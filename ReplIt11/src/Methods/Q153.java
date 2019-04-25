package Methods;

import java.util.Scanner;

public class Q153 {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int num = scan.nextInt();
	    isPalindrome(num);
	  }
	  
	  public static void isPalindrome(int num){
	    //WRITE YOUR CODE HERE
	     int resultNumber = 0;
	    for (int i = num; i !=0; i /= 10) 
	        resultNumber = resultNumber * 10 + i % 10;
	    
	    if( resultNumber == num) System.out.println("true");
	    else System.out.println("false");
	    
	  }
}
