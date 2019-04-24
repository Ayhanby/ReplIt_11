package Arrays_Q109_Q137;

import java.util.*;

public class Q122 {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    int rows = inp.nextInt(), cols = inp.nextInt();
	    int[][] arr = new int[rows][cols];
	    for(int i=0 ;i<=rows-1;i++)
	    {
	      for(int j=0 ;j<=cols-1;j++)
	      {
	        arr[i][j]=inp.nextInt();
	      }//end for cols
	    }//end for rows
	    
	    
	    //TODO write your code below
	     int[] arr1=new int[99999999];
	     int z=0;
	    for(int i=0; i<arr.length; i++)
	       for(int j=0; j<arr[i].length; j++){
	          arr1[z]=arr[i][j];
	          z++;
	       }
	    
	       Arrays.sort(arr1);
	       System.out.println(arr1[arr1.length-1]);
	          
	       
	      
	    
	    
	    
	    
	    
	   
	  }//end main

}
