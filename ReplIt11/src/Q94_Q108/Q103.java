package Q94_Q108;

import java.util.Scanner;

public class Q103 {
	 public static void main(String[] args) {
		    int count = 0;
		    Scanner scan = new Scanner(System.in);
		    String  str = scan.next();
		    int times=0;
		    for(int i=0; i<str.length()-3; i++){
		      String AA=str.substring(i,i+4);
		        if(AA.startsWith("co") && AA.endsWith("e")){
		              times +=1;
		        }
		    }
		    System.out.println(times);
		  }
}
