package Methods;

import java.util.Arrays;

public class Q194 {
	public static boolean isAnagram(String word1, String word2) {
		   
	    char[] BB=word1.toLowerCase().toCharArray(),
	           CC=word2.toLowerCase().toCharArray();
	    Arrays.sort(BB);
	    Arrays.sort(CC);
	    String A1=Arrays.toString(BB),
	           B1=Arrays.toString(CC);
	           
	    return A1.equals(B1)?true:false;
    
  }

}
