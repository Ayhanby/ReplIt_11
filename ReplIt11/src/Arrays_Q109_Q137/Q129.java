package Arrays_Q109_Q137;

import java.util.*;

public class Q129 {
	 public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
				int size = scan.nextInt();
				int[] num = new int[size];
				for(int i =0; i < size; i++) {
					num[i] = scan.nextInt();
				}
				//WRITE YOUR CODE HERE
				int[] arr;
				if(num.length>=2){
				  arr=new int[2];
				  arr[0]=num[0];
				  arr[1]=num[1];
				  System.out.println(Arrays.toString(arr));
				}else {
				  arr=new int[1];
				  arr[0]=num[0];
				  System.out.println(Arrays.toString(arr));
				}
				
				
				
		    
		  }

}
