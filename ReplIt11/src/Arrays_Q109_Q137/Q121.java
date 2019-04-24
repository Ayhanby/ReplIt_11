package Arrays_Q109_Q137;

import java.util.*;

public class Q121 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    
	    String reversed = "";
	    //TODO: start your code here
	    String[] str=sentence.split(" ");
				String[] newstr=new String[str.length];
				
					    int z=0;
					    for(int i=str.length-1;i>=0;i--){
					     newstr[z]=str[i];
					     ++z;
					    }
					    
					    reversed=Arrays.toString(newstr).replace(",","").replace("[","").replace("]","");
	    
	    
	    //End your code here. do not modify below statement
	    System.out.println(reversed);
	    
	  }

}
