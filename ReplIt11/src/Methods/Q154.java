package Methods;

import java.util.Scanner;

public class Q154 {
	 public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    int num = scan.nextInt();
		    fib(num);
		  }
		  
		  public static void fib(int num){
		    //WRITE YOUR CODE HERE
		  int[] zz=new int[num+2];
		  zz[0]=0;
		  zz[1]=1;
		  
		  for(int i=2; i<=num; i++)
		    zz[i]=zz[i-1]+zz[i-2];
		  
		  System.out.println(zz[num]);
		  
		  }

}
