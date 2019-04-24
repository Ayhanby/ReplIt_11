package Arrays_Q109_Q137;

import java.util.Scanner;

public class Q118 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    String email = input.nextLine();
	    
	    //Write your code below
	    String str=email;
	    int num=0;
	    while(str.contains("@")){
	      str=str.replaceFirst("@","");
	      num++;
	    }
	    if(num==1){
	    System.out.println("Email id: "+email.substring(0,email.indexOf("@"))
	    +"\nEmail domain: "+email.substring(email.indexOf("@")+1));
	    }else System.out.println("invalid email");
	    
	    
	  }

}
