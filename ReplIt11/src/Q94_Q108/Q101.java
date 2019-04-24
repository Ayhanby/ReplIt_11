package Q94_Q108;

import java.util.Scanner;

public class Q101 {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
			String str = scan.next();
			int n = scan.nextInt();
			String str2=str.substring(str.length()-n, str.length());
			for(int i=0; i<n; i++){
			  System.out.print(str2);
			}		
			
	  }

}
