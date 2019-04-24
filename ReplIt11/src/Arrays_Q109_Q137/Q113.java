package Arrays_Q109_Q137;

import java.util.*;

public class Q113 {
	 public static void main(String[] args) {
		    
		    Scanner input = new Scanner(System.in);
		    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
		   

		
		    int z=words.length;
		    String[] str=new String[z];
		    for(int i=0; i<z; i++){
		      str[i]= ""+words[i].charAt(0)+
		      words[i].charAt(words[i].length()-1);
		    }
		    System.out.println(Arrays.toString(str));
		    
		  }

}
