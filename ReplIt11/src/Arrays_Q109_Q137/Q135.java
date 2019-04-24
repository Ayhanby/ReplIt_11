package Arrays_Q109_Q137;

import java.util.Arrays;

public class Q135 {
	public static void main(String[] args) {
	    String[][] chessBoard = new String[8][8];
	    //WRITE YOUR CODE HERE
	    String z[]={"a", "b", "c", "d", "e", "f", "g", "h"};
	    
	    for(int i=0; i<8; i++){
	      for(int f=0; f<8; f++){
	        chessBoard[i][f]=""+(i+1)+z[f];
	      }
	    }
	    //DO NOT CHANGE
	    System.out.println(Arrays.deepToString(chessBoard));
	  }

}
